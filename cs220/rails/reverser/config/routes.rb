Rails.application.routes.draw do
root 'text_reverser#input'
match '/reverse' => 'text_reverser#reverse', via: :get
end
