class CalculateController < ApplicationController
  def input1
  end

  def input2
  end

  def output
  end

  def add
    @output = params["input1"].to_i + params["input2"].to_i
    render 'output'
  end

  def subtract
    @output = params["input1"].to_i - params["input2"].to_i
    render 'output'
  end

  def multiply
    @output = params["input1"].to_i * params["input2"].to_i
    render 'output'
  end

  def divide
    @output = params["input1"].to_f / params["input2"].to_f
    render 'output'
  end
end
