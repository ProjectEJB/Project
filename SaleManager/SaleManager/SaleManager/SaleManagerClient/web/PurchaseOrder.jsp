
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
    <head>
    <script src="<c:url value="/resources/js/chart-master/Chart.js"/>"></script>
        <c:import url="/resources/common/header.jsp"/>
        <link href="<c:url value="/resources/css/zabuto_calendar.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/js/gritter/css/jquery.gritter.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/lineicons/style.css"/>" rel="stylesheet">
        <c:import url="/resources/common/header.jsp"/>

        <title>Manager Sell</title>
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
                                        <!--                                    <button type="button" class="btn btn-primary btnAdd" data-toggle="modal"
                                                                                    data-target="#productModal">Thêm Hóa Đơn Mua Hàng
                                                                            </button>-->
                                        <ul class="nav pull-right ">
                                            <li><a class="logout" href="addPurchaseOrder.jsp">Thêm Hóa Đơn Mua Hàng</a></li>
                                        </ul>
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

                                        </tr>
                                    </thead>

                                    <tbody>
                                        <!--{{#list}}-->
                                        <tr>
                                            <td class="text-center">{{orderNo}}</td>
                                            <td class="text-center">{{orderDate}}</td>
                                            <td class="text-center">{{discAmt}}</td>
                                            <td class="text-center">{{taxAmt}}</td>
                                            <td class="text-center">{{amount}}</td>



                                        </tr>
                                        <!--{{/list}}-->
                                    </tbody>
                                </table>
                            </div>
                            <div id="Add" class="row">

                            </div>
                            <!-- page start-->
                            <div class="modal fade" id="addPurchase" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                                 aria-hidden="true" data-keyboard="false" data-backdrop="static" style="display: none;">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="productModalTitle">Thêm Hóa Đơn Mua Hàng</h4>
                                        </div>
                                        <div class="modal-body form-horizontal style-form">
                                            <form id="product-form" class="form-horizontal" role="form">
                                                <div class="form-inline" role="form">
                                                    <div class="row">
                                                        <label class="col-md-4 col-md-offset-1 control-label" for="productName">Số Hóa Đơn</label>
                                                        <div class="form-group col-sm-6">
                                                            <input type="text" class="form-control" name="productName" id="txtorderNo">
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-inline" role="form">
                                                    <div class="row">
                                                        <label class="col-md-4 col-md-offset-1 control-label" for="price">Ngày Hóa Đơn</label>
                                                        <div class="form-group col-sm-6">
                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                   name="price" id="txtorderDate">
                                                        </div>
                                                    </div>
                                                </div>


                                                <div class="form-inline" role="form">
                                                    <div class="row">
                                                        <label class="col-md-4 col-md-offset-1 control-label" for="nation">Chiết Khấu</label>
                                                        <div class="form-group col-sm-6">
                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                   name="price" id="txtdiscAmount">
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-inline" role="form">
                                                    <div class="row">
                                                        <label class="col-md-4 col-md-offset-1 control-label" for="description">Thuế GTGT</label>
                                                        <div class="form-group col-sm-6">
                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                   name="price" id="txttaxAmount">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-inline" role="form">
                                                    <div class="row">
                                                        <label class="col-md-4 col-md-offset-1 control-label" for="description">Thành Tiền</label>
                                                        <div class="form-group col-sm-6">
                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                   name="price" id="txtamount">
                                                        </div>
                                                    </div>
                                                </div>


                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
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
    <script src="<c:url value="resources/js/myjs/purchaseOrder.js" />"></script>
</html>
