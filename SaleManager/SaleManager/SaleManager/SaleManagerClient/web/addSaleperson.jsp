
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
                                <h3> Thêm Nhân Viên</h3>
                            </div>

                        </div>
                        <hr>
                    </header>
                    <div class="row mt">
                        <div class="col-lg-12">
                            <div class="form-panel">
                                <h4 class="mb"><i class="fa fa-angle-right"></i> Chi Tiết</h4>
                                <form class="form-horizontal style-form" method="get">
                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="productName">Mã NVBH</label>
                                            <div class="form-group col-sm-6">
                                                <input type="text" class="form-control" name="productName" id="txtid">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="productName">Tên NVBH</label>
                                            <div class="form-group col-sm-6">
                                                <input type="text" class="form-control" name="productName" id="txtname">
                                            </div>
                                        </div>
                                    </div>                  

                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="nation">Địa chỉ</label>
                                            <div class="form-group col-sm-6">
                                                <input type="text" class="form-control"
                                                        id="txtaddress">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-inline" role="form">
                                        <div class="row">
                                            <label class="col-md-4 col-md-offset-1 control-label" for="description">Trang thái</label>
                                            <div class="form-group col-sm-6">
                                                <input type="text" class="form-control" 
                                                        id="txtstatus">
                                            </div>
                                        </div>
                                    </div>
                                    

                                </form>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" id="btnBack">Trở về</button>
                                    <button type="button" class="btn btn-primary" id="btnAdd">Thêm nhân viên</button>
                                </div>

                            </div>
                        </div>
                    </div>


                </section>
            </section>
        </section>
    </body>



    <script src="<c:url value="resources/js/myjs/saleperson.js" />"></script>
</html>
