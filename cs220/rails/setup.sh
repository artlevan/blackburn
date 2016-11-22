#!/bin/bash -x
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cp $DIR/basegemfile Gemfile
touch db/development.sqlite3 # otherwise owned by root
touch db/test.sqlite3 # otherwise owned by root
touch log/development.log # otherwise owned by root
touch log/test.log # otherwise owned by root
bundle install --without production #no one has postgress installed
