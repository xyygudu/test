
����ͨ�������������ϴ������Զ������gitee����������Ἰ�����
1.�������빫Կ���˲���Ҫ�ں���pushʱ�����ٴ�������Ҫ����������û�����
ssh-keygen -t rsa -C "���������ַ"
2.���س�ʼ��һ����Ŀ
git config --global user.name "your name"
git config --global user.email "your email" (�����в���Ҳ�У����Ǹ��߱����������)
git init
git remote add origin "�����Ŀ��ַ(�ղ������ƴ�������Ŀ�ĵ�ַ)" 
//ע:��Ŀ��ַ��ʽΪ:http://git.oschina.net/xxx/xxx.git
���� git@git.oschina.net:xxx/xxx.git
3.�ύ�����ļ�
git pull origin master
git add .
git commit -m "shuomingwenzi"
git push origin master
������ο�csdn���� https://blog.csdn.net/askycat/article/details/55106299
