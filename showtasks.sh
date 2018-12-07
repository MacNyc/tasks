#!/usr/bin/env bash

crud(){
cp runcrud.sh
}

runBrowser(){
open http://localhost:8080/crud/v1/tasks
end
}

fail() {
  echo "There were errors"
}

end() {
  echo "Work is finished"
}

if ./gradlew build; then
   crud
   runBrowser
else
   fail
fi