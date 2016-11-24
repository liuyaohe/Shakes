<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<base href="<%=basePath%>">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>用户管理</title>
    <link rel="stylesheet" type="text/css" href="../../components/BootStrap/css/bootstrap-combined.min.css">
    <link rel="stylesheet" type="text/css" href="../../components/BootStrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="../../components/BootStrap/css/bootstrap-theme.min.css"/>
    <link rel="stylesheet" type="text/css" href="../../components/BootStrap/css/bootstrap-table.min.css"/>
    <script type="text/javascript" src="../../components/JQuery/1.11.3/jquery.min.js"></script>
    <script type="text/javascript" src="../../components/BootStrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../components/BootStrap/js/bootstrap-table.js"></script>
    <script type="text/javascript" src="../../components/BootStrap/js/bootstrap-table-export.js"></script>
    <script src="../../components/BootStrap/js/html5shiv.js"></script>
    <script src="../../components/BootStrap/js/respond.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //
            $('#userListTab').bootstrapTable({
                url: "admin/getUserList",//数据源
                dataField: "rows",//服务端返回数据键值 就是说记录放的键值是rows，分页时使用总记录数的键值为total
                height: tableHeight(),//高度调整
                search: true,//是否搜索
                pagination: true,//是否分页
                pageSize: 20,//单页记录数
                pageList: [5, 10, 20, 50],//分页步进值
                sidePagination: "server",//服务端分页
                contentType: "application/json",//请求数据内容格式 默认是 application/json 自己根据格式自行服务端处理
                dataType: "json",//期待返回数据类型
                method: "post",//请求方式
                searchAlign: "left",//查询框对齐方式
                queryParamsType: "limit",//查询参数组织方式
                singleSelect: true,
                queryParams: function getParams(params) {
                    //params obj
                    params.other = "otherInfo";
                    return params;
                },
                searchOnEnterKey: false,//回车搜索
                showRefresh: true,//刷新按钮
                showColumns: true,//列选择按钮
                buttonsAlign: "left",//按钮对齐方式
                toolbar: "#toolbar",//指定工具栏
                toolbarAlign: "right",//工具栏对齐方式
                columns: [
                    {
                        title: "全选",
                        field: "select",
                        checkbox: true,
                        width: 20,//宽度
                        align: "center",//水平
                        valign: "middle"//垂直
                    },
                    {

                        field: "id",//键名
                        title: "编号",//标题
                        sortable: true,//是否可排序
                        order: "desc"//默认排序方式
                    },
                    {
                        field: "name",
                        title: "用户名",
                        sortable: true,
                        titleTooltip: "this is name"
                    },
                    {
                        field: "mobile",
                        title: "电话",
                        sortable: true,
                    }
                ],
                onClickRow: function(row, $element) {
                    //$element是当前tr的jquery对象
                    $element.css("background-color", "green");
                },//单击row事件
                locale: "zh-CN",//中文支持,
                //detailView: false, //是否显示详情折叠

        });

            //根据窗口调整表格高度
            $(window).resize(function() {
                $('#userListTab').bootstrapTable('resetView', {
                    height: tableHeight()
                })
            });

        });

        //自适应改变高度
        function tableHeight() {
            return $(window).height() - 50;
        }

        function infoFormatter(value, row, index){
            return "id:" + row.id + " name:" + row.name + " age:" + row.age;
        }
    </script>
</head>
<body>
<jsp:include page="/admin/head"/>
<br/>
<br/>
<div class="container">
    <div class="row">
        <article class="col-xs-12 maincontent">
            <header class="page-header">
                <h1 class="page-title">用户管理</h1>
            </header>
            <div id="toolbar"></div>
            <table id="userListTab" class="table table-hover"></table>
        </article>
    </div>
</div>
<jsp:include page="/admin/foot"/>
</body>
</html>
