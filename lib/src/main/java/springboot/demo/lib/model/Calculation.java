package springboot.demo.lib.model;

import java.util.List;

public class Calculation {

  String function;
  private List<String> input;
  private List<String> output;

  public Calculation(List<String> input, List<String> output, String function) {
    this.input = input;
    this.output = output;
    this.function = function;
  }

  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public List<String> getInput() {
    return input;
  }

  public void setInput(List<String> input) {
    this.input = input;
  }

  public List<String> getOutput() {
    return output;
  }

  public void setOutput(List<String> output) {
    this.output = output;
  }
}
