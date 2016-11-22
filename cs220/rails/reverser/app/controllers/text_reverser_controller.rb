class TextReverserController < ApplicationController
  def input
  end

  def output
  end

  def reverse
    @output = params["input"].reverse
    render 'output'
  end
end
