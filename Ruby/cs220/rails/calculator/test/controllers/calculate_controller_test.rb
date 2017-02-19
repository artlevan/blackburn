require 'test_helper'

class CalculateControllerTest < ActionDispatch::IntegrationTest
  test "should get input" do
    get calculate_input_url
    assert_response :success
  end

  test "should get output" do
    get calculate_output_url
    assert_response :success
  end

end
