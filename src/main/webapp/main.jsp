<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>天听矿机专卖</title>
        <link rel="stylesheet" href="layui/css/layui.css">
    </head>

    <body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">天听矿机专卖</div>
            <!-- 头部区域（可配合layui已有的水平导航） -->
            <ul class="layui-nav layui-layout-left">
                <li class="layui-nav-item">
                    <a href="">控制台</a>
                </li>
                <li class="layui-nav-item">
                    <a href="">商品管理</a>
                </li>
                <li class="layui-nav-item">
                    <a href="">用户</a>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">其它系统</a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="">邮件管理</a>
                        </dd>
                        <dd>
                            <a href="">消息管理</a>
                        </dd>
                        <dd>
                            <a href="">授权管理</a>
                        </dd>
                    </dl>
                </li>
            </ul>
            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://t.cn/RCzsdCq" class="layui-nav-img"> Admin
                    </a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="">基本资料</a>
                        </dd>
                        <dd>
                            <a href="">安全设置</a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="">退了</a>
                </li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="test">
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;">矿机转让</a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="#">矿机列表</a>
                            </dd>
                            <dd>
                                <a href="#">矿机买入</a>
                            </dd>
                            <dd>
                                <a href="/mill/payRule.action">交易规则</a>
                            </dd>
                            <dd>
                                <a href="#">矿机编号转移</a>
                            </dd>
                            <dd>
                                <a href="#">交易记录</a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;">个人中心</a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="#">账号获取</a>
                            </dd>
                            <dd>
                                <a href="#">我的余额</a>
                            </dd>
                            <dd>
                                <a href="#">现金充值</a>
                            </dd>
                            <dd>
                                <a href="#">余额提现</a>
                            </dd>
                            <dd>
                                <a href="#">我的矿机</a>
                            </dd>
                            <dd>
                                <a href="#">托管矿机</a>
                            </dd>
                            <dd>
                                <a href="#">提取矿机</a>
                            </dd>
                            <dd>
                                <a href="transactionRecords.jsp" target="mybody">交易记录</a>
                            </dd>
                            <dd>
                                <a href="#">安全认证</a>
                            </dd>
                            <dd>
                                <a href="#">银行卡绑定</a>
                            </dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>
        <div class="layui-body">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">
                <!--内容主体区域-->
                <iframe src="transactionRecords.jsp" height="700" width="100%" name="mybody" frameborder="no"></iframe>
            </div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            © layui.com - 底部固定区域
        </div>
    </div>
    <script src="layui/layui.all.js"></script>
    <script>
        //JavaScript代码区域
    </script>
    </body>
</html>
