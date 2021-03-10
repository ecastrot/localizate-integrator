<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap"
  rel="stylesheet">
<link rel="stylesheet" href="css/main.css">

<div class="general-container">
  <div class="main-container">

    <header>
      <div class="refresh">
        <img src="images/update.png">
        <a href="/">Atualizar estado</a>
      </div>
      <c:choose>
        <c:when test="${synchronizing}">
          <div class="sincronizing">
            <img src="images/processing.gif"> <span>Sincronizando</span>
          </div>
        </c:when>
        <c:otherwise>
          <div class="stop">
            <img src="images/stop.gif"> <span>Falló sincronización</span>
          </div>
        </c:otherwise>
      </c:choose>
      <div class="lastUpdate">
        <span>Última sincronización: ${lastSyncDate}</span>
      </div>
    </header>

    <h4>Integración de Localizate con Control Transporte</h4>

    <section>
      <div>
        <strong>Placas en proceso de ingreación</strong>
        <div class="plates">
          <c:forEach items="${plates}" var="plate">
            <div>
              <a href="/-${plate}">x</a>
              <span>${plate}</span>
            </div>
          </c:forEach>
        </div>
      </div>
      <div class="action">
        <input id="plate">
        <button  onclick="addPlate()">Agregar Placa</button>
      </div>
    </section>

    <footer>
      <img src="images/localizategps.png"> <img src="images/logo-control-t.png">
    </footer>
  </div>
</div>

<script type="text/javascript">
function addPlate(){
	const plateValue = document.getElementById('plate').value;
	window.location.href='/' + plateValue;
}
</script>

