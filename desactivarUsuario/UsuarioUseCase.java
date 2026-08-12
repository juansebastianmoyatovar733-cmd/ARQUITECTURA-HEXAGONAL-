public interface UsuarioUseCase {
    Usuario registrar(String username, String email);
    Optional<Usuario> buscarPorUsername(String username);
    List<Usuario> listarActivos();
    void desactivarUsuario(String username); // NUEVO
}
