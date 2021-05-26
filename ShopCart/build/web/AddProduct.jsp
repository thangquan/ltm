<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="ThemeBucket">
        <link rel="shortcut icon" href="style/images/favicon.png">
        <title>Admin</title>

        <link href="style/bs3/css/bootstrap.min.css" rel="stylesheet">
        <link href="style/js/jquery-ui/jquery-ui-1.10.1.custom.min.css" rel="stylesheet">
        <link href="style/css/bootstrap-reset.css" rel="stylesheet">
        <link href="style/font-awesome/css/font-awesome.css" rel="stylesheet">
        <link href="style/css/style.css" rel="stylesheet">
        <link href="style/css/style-responsive.css" rel="stylesheet"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    </head>
    <body>


    <section>
                <section id="main-content">
                    <section class="wrapper">
                        <div class="row">
                            <div class="col-md-12">
                                <section class="panel">

                                    <header class="panel-heading">
                                        <h1>Thêm mới </h1>
                                    </header>

                                    <div class="panel-body">
                                        <form action="add" method="post">
                                            <table class="table table-hover">
                                                <tr>
                                                    <td> Name </td>
                                                    <td><input value="" name="name" type="text" class="form-control" required></td>
                                                </tr>
                                                <tr class="trDes">
                                                    <td>size</td>
                                                    <td><textarea rows="10" name="size" type="text" class="txtDes form-control" required></textarea></td>
                                                </tr>
                                                <tr>
                                                    <td> Category </td>
                                                    <td>
                                                        <select name="category" class="form-select" aria-label="Default select example" size="1">
                                                            <c:forEach items="${listCC}" var="o">
                                                                <option value="${o.getCid()}"> ${o.getCname()}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <td> image </td>
                                                    <td><textarea name="image" type="text" class="form-control" required></textarea></td>
                                                </tr>
                                                <tr>
                                                    <td>color </td>
                                                    <td><input value="" name="color" type="text" class="form-control" required><td>
                                                </tr>
                                                <tr>
                                                    <td> slc</td>
                                                    <td><input value="" name="soluongcon" type="number" class="form-control" required></td>
                                                </tr>
                                                <tr>
                                                    <td> price </td>
                                                    <td><input value="" name="price" type="number" class="form-control" required></td>
                                                </tr>


                                                <tr>
                                                    <td><input type="submit" class="form-control btn btn-default col-md-2" value="Add"></td>
                                                </tr>

                                            </table>

                                        </form>
                                    </div>

                                </section>
                            </div>
                        </div>
                    </section>
                </section>
            </section>
    </body>
</html>



