document.addEventListener("DOMContentLoaded", () => {
  fetch("http://localhost:3000/incidencias") // Cambia al puerto que uses
    .then(res => res.json())
    .then(data => {
      const tbody = document.getElementById("tabla-incidencias");

      data.forEach(incidencia => {
        const fila = document.createElement("tr");

        fila.innerHTML = `
          <td>${incidencia.id}</td>
          <td>${incidencia.nombre_ubicacion}</td>
          <td>${incidencia.tipo_dano}</td>
          <td>${formatearPrioridad(incidencia.prioridad)}</td>
          <td>${new Date(incidencia.fecha_reporte).toLocaleDateString()}</td>
          <td>
            <button onclick="verIncidencia(${incidencia.id})">👁️</button>
            <button onclick="editarIncidencia(${incidencia.id})">✏️</button>
            <button onclick="eliminarIncidencia(${incidencia.id})">🗑️</button>
          </td>
        `;

        tbody.appendChild(fila);
      });
    });
});

function formatearPrioridad(prioridad) {
  const colores = {
    baja: "🟢 Baja",
    media: "🟡 Media",
    alta: "🔴 Alta"
  };
  return colores[prioridad] || prioridad;
}

function verIncidencia(id) {
  alert("Ver detalles aún no implementado.");
}

function editarIncidencia(id) {
  window.location.href = `editar_incidencia.html?id=${id}`;
}

function eliminarIncidencia(id) {
  if (confirm("¿Seguro que deseas eliminar esta incidencia?")) {
    fetch(`http://localhost:3000/incidencias/${id}`, {
      method: "DELETE"
    })
      .then(res => res.json())
      .then(data => {
        alert(data.message || "Incidencia eliminada");
        location.reload();
      });
  }
}
