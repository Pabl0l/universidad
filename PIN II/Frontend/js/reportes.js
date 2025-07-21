function actualizarEstado(select) {
  const fila = select.closest('tr');
  const estado = select.value;
  const celdaTecnico = fila.querySelector('.tecnico');

  if (estado === "OK" && celdaTecnico.textContent === "") {
    const nombre = prompt("¿Confirma que el mantenimiento fue realizado? Ingrese el nombre del técnico:");

    if (nombre && nombre.trim() !== "") {
      if (confirm(`¿Está seguro que ${nombre} revisó y solucionó el problema?`)) {
        celdaTecnico.textContent = nombre;
        select.disabled = true; // ya no puede cambiar el estado
      } else {
        select.value = "Pendiente";
      }
    } else {
      alert("Nombre inválido. Se canceló la operación.");
      select.value = "Pendiente";
    }
  }
}

function verDetalles(fila) {
  const celdas = fila.getElementsByTagName('td');
  document.getElementById('modal-fecha').textContent = celdas[0].textContent;
  document.getElementById('modal-ubicacion').textContent = celdas[1].textContent;
  document.getElementById('modal-descripcion').textContent = celdas[2].textContent;
  document.getElementById('modal-estado').textContent = celdas[3].querySelector('select')?.value || celdas[3].textContent;
  document.getElementById('modal-revisado').textContent = celdas[4].textContent;

  document.getElementById('modal').classList.remove('oculto');
}

function cerrarModal() {
  document.getElementById('modal').classList.add('oculto');
}
