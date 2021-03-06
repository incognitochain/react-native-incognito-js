require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-incognito-js"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description  = <<-DESC
                    React Native Incognito Js
                   DESC
  s.homepage     = "https://github.com/github_account/react-native-incognito-js"
  s.license      = "MIT"
  # s.license    = { :type => "MIT", :file => "FILE_LICENSE" }
  s.authors      = { "keresh" => "vuong@autonomous.com" }
  s.platforms    = { :ios => "9.0" }
  s.source       = { :git => "https://github.com/incognitochain/react-native-incognito-js.git", :tag => "#{s.version}" }

  s.source_files = "ios/**/*.{h,m,swift}"
  s.requires_arc = true

  s.dependency "React"
  # ...
  # s.dependency "..."
end

