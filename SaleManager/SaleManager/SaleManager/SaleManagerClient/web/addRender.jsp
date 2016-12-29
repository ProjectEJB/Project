
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
                                <h3> Thêm Phiếu Trả Hàng</h3>
                            </div>

                        </div>
                        <hr>
                    </header>

                    <div class="row mt">
                        <div class="col-lg-12">
                            <div class="form-panel">
                                <h4 class="mb"><i class="fa fa-angle-right"></i> Chi Tiết</h4>

                                <div class="input-group" style="width: 500px;margin: 0 auto;margin-top: 5px">
                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label pull-left" for="productName">Số Hóa Đơn</label>
                                            <div class="form-group col-sm-6">
                                                <input type="text" class="form-control " name="productName" id="txtorderNo">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="price">Ngày Hóa Đơn</label>
                                            <div class="form-group col-sm-6">
                                                <input type="date" class="form-control" 
                                                       name="price" id="txtorderDate">
                                            </div>
                                        </div>
                                    </div>

                                    <table class="table table-hover">
                                        <thead>
                                            <tr>
                                                <th>Mã hàng</th>
                                                <th>Tên hàng</th>
                                                <th>Số lượng</th>
                                                <th>Đơn giá</th>
                                                <th>Đơn vị tính</th>
                                                <th>Chiết khấu</th>

                                                <th>Thành tiền</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td> <input type="text" class="form-control " name="productName" id="txtInvtID"></td>
                                                    <%--<c:set var="result" value="${requestScope.SEARCH}"/>--%>

                                                <td>   <label id="txtInventName"></label></td>
                                                <td><input type="number" min="0" id="txtSoluong"  required /></td>
                                                <td><label id="txtDongia"></label></td>
                                                <td>thùng</td>
                                                <td><input type="number" min="0" id="txtchietkhau"  required /></td>

                                                <td><label id="txtthanhtien"></label></td>

                                            </tr>

                                            <!--<button  class="btn btn-info" style="float: right;margin-top: 10px;margin-right: 10px" id="btnSearch">Tìm</button>-->
                                            <!--<button type="button" class="btn btn-primary" id="btnAdd">Thêm Hóa Đơn</button>-->
                                        </tbody>
                                    </table>
                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="nation">Chiết Khấu</label>
                                            <!--                                            <div class="form-group col-sm-6">
                                                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                                                   name="price" id="txtdiscAmount">
                                                                                        </div>-->
                                            <label class="col-md-4 col-md-offset-1 control-label"  for="description" id="txtdiscAmount" ></label><label>.VNĐ</label>
                                        </div>
                                    </div>

                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="description">Thuế GTGT :</label>
                                            <!--                                            <div class="form-group col-sm-6">
                                                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                                                   name="price" id="txttaxAmount">
                                                                                        </div>-->
                                            <label class="col-md-4 col-md-offset-1 control-label"  for="description" id="txttaxAmount" ></label><label>.VNĐ</label>
                                        </div>
                                    </div>
                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="description" >Thành Tiền :</label>
                                            <!--                                            <div class="form-group col-sm-6">
                                                                                            <input type="number" class="form-control" min="1" max="1000000" placeholder=".000 VNĐ"
                                                                                                   name="price" id="txtamount">
                                                                                        </div>-->
                                            <label class="col-md-4 col-md-offset-1 control-label"  for="description" id="txtamount" ></label><label>.VNĐ</label>
                                        </div>
                                    </div>


                                    <!--</form>-->
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Trở về</button>
                                <button type="button" class="btn btn-primary" id="btnAdd">Thêm Phiếu Trả Hàng</button>
                            </div>

                        </div>
                    </div>
                    </div>


                </section>
            </section>
        </section>
        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/jquery-1.8.3.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="resources/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="resources/js/jquery.scrollTo.min.js"></script>
        <script src="resources/js/jquery.nicescroll.js" type="text/javascript"></script>
        <script src="resources/js/jquery.sparkline.js"></script>
    </body>



    <script src="<c:url value="resources/js/myjs/render.js" />"></script>
</html>
