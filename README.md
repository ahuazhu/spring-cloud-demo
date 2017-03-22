# 极简Spring Cloud Demo
本实例展示了一个极小的Spring cloud框架搭建，适合spring cloud的快速上手。包括以下功能：
* 服务注册
* 服务发现
* 服务调用      
                             ┏━━━━━━━━━━━━━┓                           ┏━━━━━━━━━━━━━━┓
--------- ahuazhu ---------->┃             ┃ --------- ahuazhu ------> ┃              ┃
                             ┃ echo-client ┃                           ┃ echo-service ┃
<--- hello world ahuazhu ----┃             ┃ <---- world ahuazhu ----- ┃              ┃
                             ┗━━━━━━━━━━━━━┛                           ┗━━━━━━━━━━━━━━┛