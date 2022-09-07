package GooglePrep.GooglePrep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivision {

	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    
		if(equations == null || queries == null || values == null || equations.size() == 0
				|| queries.size() == 0 || values.length == 0) return new double[0];
		
		int equationsAndValuesLength = equations.size();
		Map<String,Variable> variables = new HashMap<>();
		String currentVariableName;
		Variable currentVariable;
		
		for(int i = 0; i < equationsAndValuesLength; i++) {
			// Construct Letter object for numerator in equation or retrieve if it exists and add new relationship to valueConversionMap
			currentVariableName = equations.get(i).get(0);
			if(variables.containsKey(currentVariableName)) currentVariable = variables.get(currentVariableName);
			else currentVariable = new Variable(currentVariableName);
			currentVariable.valueConversionMap.put(equations.get(i).get(1), values[i]);
			variables.put(currentVariableName, currentVariable);
			
			// Construct Letter object for denominator in equation or retrieve if it exists and add new relationship to valueConversionMap
			currentVariableName = equations.get(i).get(1);
			if(variables.containsKey(currentVariableName)) currentVariable = variables.get(currentVariableName);
			else currentVariable = new Variable(currentVariableName);
			currentVariable.valueConversionMap.put(equations.get(i).get(0), 1.0/values[i]);
			variables.put(currentVariableName, currentVariable);
		}
		
		double[] results = new double[queries.size()];
		int resultIndex = 0;
		Set<String> visited;
		for(List<String> query: queries) {
			currentVariable = variables.get(query.get(0));
			if(currentVariable == null || variables.get(query.get(1)) == null) {
				results[resultIndex] = -1;
				resultIndex++;
				continue;
			}
			if(currentVariable.variableName.equals(query.get(1))) results[resultIndex] = 1;
			else if(currentVariable.valueConversionMap.containsKey(query.get(1))) {
				results[resultIndex] = currentVariable.valueConversionMap.get(query.get(1));
			} else {
				visited = new HashSet<>();
				visited.add(currentVariable.variableName);
				results[resultIndex] = depthFirstSearch(currentVariable,1.0,query.get(1),visited,variables);				
			}
			resultIndex++;
		}
		return results;
    }
	
	private double depthFirstSearch(Variable variable, double multiplier, String searchingFor, Set<String> visited,
										Map<String,Variable> variables) {
		if(variable.valueConversionMap.containsKey(searchingFor)) {
			return multiplier * variable.valueConversionMap.get(searchingFor);
		}
		double result = -1;
		for(Map.Entry<String, Double> entry: variable.valueConversionMap.entrySet()) {
			if(visited.contains(entry.getKey())) continue;
			visited.add(entry.getKey());
			Variable currentVariable = variables.get(entry.getKey());
			result = depthFirstSearch(currentVariable,(multiplier * entry.getValue()),searchingFor,visited,variables);
			if(result > -1) return result;
			visited.remove(entry.getKey());
		}
		return result;
	}
	
	private class Variable {
		
		private String variableName;
		private Map<String,Double> valueConversionMap;
		
		public Variable(String variableName) {
			this.variableName = variableName;
			this.valueConversionMap = new HashMap<>();
		}
		
	}

}
