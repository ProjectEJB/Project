<%-- 
    Document   : Sale
    Created on : Dec 27, 2016, 1:10:35 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--<link href="resources/css/bootstrap.css" rel="stylesheet">
external css
<link href="resources/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="resources/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css" href="resources/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css" href="resources/lineicons/style.css">    

 Custom styles for this template 
<link href="resources/css/style.css" rel="stylesheet">
<link href="resources/css/style-responsive.css" rel="stylesheet">

<script src="resources/js/chart-master/Chart.js"></script>-->

<!DOCTYPE html>
<html>
    <head>
        <script src="<c:url value="/resources/js/chart-master/Chart.js"/>"></script>
        <c:import url="/resources/common/header.jsp"/>
        <link href="<c:url value="/resources/css/zabuto_calendar.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/js/gritter/css/jquery.gritter.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/lineicons/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <section id="container">

            <c:import url="/resources/common/topBar.jsp"/>
            <c:import url="/resources/common/menu.jsp"/>
            <section id="main-content">
                <section class="wrapper">
                    <header>
                        <div class="row">
                            <div class="col-md-6">
                                <h3> Danh Sách Hóa Đơn Mua Hàng</h3>
                            </div>
                            <div class="col-md-6 text-right">
                                <div class="form-group">
                                    <h3>
                                        <button type="button" class="btn btn-primary add-btn" data-toggle="modal"
                                                data-target="#productModal">Thêm Hóa Đơn Mua Hàng
                                        </button>
                                    </h3>
                                </div>
                            </div>
                        </div>
                        <hr>
                    </header>
                    <div class="row">
                        <div class="col-md-12">
                            <div id="listLeague" class="row">

                            </div>




                            <div id="tplList" style="display: none;">
                                <table cellpadding="0" cellspacing="0" border="0"
                                       class="display table table-bordered dataTable" id="SaleList"
                                       aria-describedby="hidden-table-info_info">
                                    <thead>
                                        <tr role="row">
                                            <th class="text-center">Số Hóa Đơn</th>
                                            <th class="text-center">Ngày Hóa Đơn </th>
                                            <th class="text-center">Chiết Khấu</th>
                                            <th class="text-center">Thuế GTGT</th>
                                            <th class="text-center">Thành Tiền</th>
                                            <th class="text-center"></th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                        <!--{{#list}}-->
                                        <tr>
                                            <td class="text-center">{{orderNo}}</td>
                                            <td class="text-center">{{orderDate}}</td>
                                            <td class="text-center">{{orderDisc}}</td>
                                            <td class="text-center">{{taxAmt}}</td>
                                            <td class="text-center">{{totalAmt}}</td>

                                            <td class="text-center">
                                                <button type="button" class="btn btn-round btn-warning sale-btn btnDetail" title="Chi Tiết"
                                                        data-toggle="modal"
                                                        data-target="#saleModal" data-id="${d}">
                                                    <i class="fa fa-money" aria-hidden="true"></i>
                                                </button>

                                            </td>

                                        </tr>
                                        <!--{{/list}}-->
                                    </tbody>
                                </table>
                            </div>
                            <!-- page start-->

                        </div>
                        <!-- page end-->
                    </div><!-- /row -->
                </section><!-- --/wrapper ---->
            </section><!-- /MAIN CONTENT -->
            <!--main content end-->
            <!--footer start-->

            <!--footer end-->
        </section>


    </body>
    <script src="<c:url value="resources/js/myjs/sale.js" />"></script>
</html>
