require 'test_helper'

class TextReverserControllerTest < ActionDispatch::IntegrationTest
  test "should get input" do
    get text_reverser_input_url
    assert_response :success
  end

  test "should get output" do
    get text_reverser_output_url
    assert_response :success
  end

end
