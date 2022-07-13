package com.example.restapi.Models;

public class RestApiMethods
{
    private static final String ipaddress = "192.168.1.124";
    public static final String StringHttp = "http://";
    //EndPoint Urls
    private static final String GetEmple = "/CRUD-PHP/listaempleados.php";
    private static final String CreateEmple = "/CRUD-PHP/crear.php";
    public static final String EndPointGetEmple = StringHttp + ipaddress + GetEmple;
    public static final String EndPointCreateEmple = StringHttp + ipaddress + CreateEmple;
}
