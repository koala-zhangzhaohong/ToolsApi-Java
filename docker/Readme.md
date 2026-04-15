# replace password to real password

docker run -v /www/docker/redis/data:/data --cpus 8 -m 14GB --name redis-server -p 55000:6379 --restart=always -d redis:latest --requirepass password
docker run --name mysql-server --privileged=true -v /www/docker/mysql/data:/var/lib/mysql --cpus 8 -m 14GB --env=MYSQL_ROOT_PASSWORD=password -p 55001:3306 --restart=always -d mysql:latest