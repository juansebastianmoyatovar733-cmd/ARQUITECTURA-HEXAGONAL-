usuarioUseCase.desactivarUsuario("lgomez");

int totalActivos = usuarioUseCase.listarActivos().size();
System.out.println("Usuarios activos despues de desactivar: " + totalActivos);
