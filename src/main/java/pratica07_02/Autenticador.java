package pratica07_02;

public class Autenticador {

    static String hist[][] = {{"joao","123"}, {"maria","abc"}, {"raul","xyz"}};

    public boolean autenticar(Usuario usuario, boolean acessoRestrito) {

        String log = " ";
        String pas = " ";

        if (usuario instanceof Vendedor) {

            log = usuario.getLogin();
            pas = usuario.getPassword();

            if (acessoRestrito) {
                return false;
            }
        } else if (usuario instanceof Gerente) {
            log = usuario.getLogin();
            pas = usuario.getPassword();
        }

        for (int i = 0; i < hist.length; i++) {

            if ( hist[i][0] != null && (hist[i][0]).equals(log)) {

                if (!(hist[i][1]).equals(pas)) {
                    return false;
                }
            }
        }

        return (true);
    }
}