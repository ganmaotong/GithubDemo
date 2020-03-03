#!/bin/bash
docker login 49.235.21.109 -u admin -p Admin123
version=2.1
docker build  -t demo:${version} .
docker tag demo:${version} 49.235.21.109/snapshot/demo:${version} .
#docker build -f Dockerfile --tag ganmaotong:demo .
#docker push ganmaotong:demo
docker push 49.235.21.109/snapshot/demo:${version}
if [ $? -eq 0 ]; then
 echo "push Success"
else
 echo "push failed"
fi