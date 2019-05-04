学习Java TestNG基础后，敲代码练习一下

接口地址：http://www.weather.com.cn/data/cityinfo/101010100.html
请求方式：GET
请求结果：
{
    "weatherinfo": {
        "city": "北京",
        "cityid": "101010100",
        "temp1": "15℃",
        "temp2": "5℃",
        "weather": "多云",
        "img1": "d1.gif",
        "img2": "n1.gif",
        "ptime": "08:00"
    }
}
测试目标：请求对应cityid代码，返回的城市是否是预期城市