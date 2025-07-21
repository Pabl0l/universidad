function mostrarInfoUsuario(nombre, cargo, resoluciones, departamento, correo) {
  document.getElementById('modalNombre').textContent = nombre;
  document.getElementById('modalCargo').textContent = cargo;
  document.getElementById('modalResoluciones').textContent = resoluciones;
  document.getElementById('modalDepartamento').textContent = departamento;
  document.getElementById('modalCorreo').textContent = correo;

  document.getElementById('modalUsuario').style.display = 'block';
}

function cerrarModal() {
  document.getElementById('modalUsuario').style.display = 'none';
}
