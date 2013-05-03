
1 - 运行某一个测试类 mvn -Dtest=TestCircle test
    mvn test -Dtest=TestNGIntro -DskipTests=false -DfailIfNoTests=false

    如果surefire插件，还配置了 <groups>${wantedGroups}</groups>，那么先根据组再去找类