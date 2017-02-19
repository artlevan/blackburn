Rails.application.routes.draw do
  root 'security#index'
  get '/security/viewallstudents'
  match '/security/viewasinglestudent' => 'security#viewasinglestudent', via: :get
  match '/security/editstudent' => 'security#editstudent', via: :get
  match '/security/addstudent' => 'security#addstudent', via: :get
  match '/security/savestudent' => 'security#savestudent', via: :post
end
