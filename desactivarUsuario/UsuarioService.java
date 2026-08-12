@Override
public void desactivarUsuario(String username) {
    Usuario usuario = buscarPorUsername(username)
            .orElseThrow(() -> new IllegalArgumentException(
                    "No existe un usuario con username: " + username));
    usuario.desactivar();
}
