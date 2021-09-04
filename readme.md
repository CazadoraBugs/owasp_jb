API OWASP

1) Inciar el scaneo

GET http://localhost:8888/JSON/ascan/action/scan/?url=URL
http://localhost:8888/JSON/ascan/action/scan/?url=http://todo.ly/

2) Porcentaje del Escaneo

GET http://localhost:8888/JSON/ascan/view/status/?scanId=ID_SCANNER
http://localhost:8888/JSON/ascan/view/status/?scanId=0

3) Que Atacks estoy realizando

http://localhost:8888/JSON/ascan/view/scanProgress/?scanId=0
http://localhost:8888/HTML/ascan/view/scanProgress/?scanId=0

4) Las Alertas que se generaron

http://localhost:8888/JSON/alert/view/alertsByRisk/?url=&recurse=


5) Generacion del reporte

http://localhost:8888/OTHER/core/other/htmlreport/?