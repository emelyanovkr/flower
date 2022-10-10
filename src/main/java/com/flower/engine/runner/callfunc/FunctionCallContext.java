package com.flower.engine.runner.callfunc;

import com.flower.engine.function.FunctionCallParameter;

import java.lang.reflect.Method;
import java.util.List;

public class FunctionCallContext {
  public final List<FunctionCallParameter> functionParameters;
  public final Method function;
  public final String functionName;

  public FunctionCallContext(
      List<FunctionCallParameter> functionParameters, Method function, String functionName) {
    this.functionParameters = functionParameters;
    this.function = function;
    this.functionName = functionName;
  }
}
