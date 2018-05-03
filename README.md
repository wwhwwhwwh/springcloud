# springcloud快速入门

##分布式/版本配置
##服务注册与发现
##路由选择
##服务调用
##负载均衡
##熔断机制
##全局锁
##领导人选举和集群状态
##分布式消息 


127.0.0.1  eureka7001.com
127.0.0.1  eureka7002.com
127.0.0.1  eureka7003.com
127.0.0.1  myzuul.com
127.0.0.1  config-3344.com
127.0.0.1  client-config.com







### db03
create database clouddb03;
use clouddb03;


-- auto-generated definition
create table dept
(
  deptno    bigint auto_increment
    primary key,
  dname     varchar(60) null,
  db_source varchar(60) null
)
  engine = InnoDB;

INSERT INTO clouddb03.dept (deptno, dname, db_source) VALUES (1, '开发部', 'clouddb03');
INSERT INTO clouddb03.dept (deptno, dname, db_source) VALUES (2, '人事部', 'clouddb03');
INSERT INTO clouddb03.dept (deptno, dname, db_source) VALUES (3, '财务部', 'clouddb03');
INSERT INTO clouddb03.dept (deptno, dname, db_source) VALUES (4, '市场部', 'clouddb03');
INSERT INTO clouddb03.dept (deptno, dname, db_source) VALUES (5, '运维部', 'clouddb03');


