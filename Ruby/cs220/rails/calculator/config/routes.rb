Rails.application.routes.draw do
root 'calculate#input'
match '/add' => 'calculate#add', via: :get
match '/subtract' => 'calculate#subtract', via: :get
match '/multiply' => 'calculate#multiply', via: :get
match '/divide' => 'calculate#divide', via: :get
end
