
怎样通过将本机代码上传到你的远程码云gitee库里，在这里提几点意见
1.首先申请公钥（此步不要在后面push时他会再次提醒你要输入密码和用户名）
ssh-keygen -t rsa -C "您的邮箱地址"
2.本地初始化一个项目
git config --global user.name "your name"
git config --global user.email "your email" (这两行不用也行，就是告诉别人这是你的)
git init
git remote add origin "你的项目地址(刚才在码云创建的项目的地址)" 
//注:项目地址形式为:http://git.oschina.net/xxx/xxx.git
或者 git@git.oschina.net:xxx/xxx.git
3.提交本地文件
git pull origin master
git add .
git commit -m "shuomingwenzi"
git push origin master
详情请参考csdn博客 https://blog.csdn.net/askycat/article/details/55106299
