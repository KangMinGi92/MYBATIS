ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;
CREATE USER mybatis IDENTIFIED BY mybatis
DEFAULT tablespace users quota unlimited ON users;
GRANT resource, CONNECT TO mybatis;