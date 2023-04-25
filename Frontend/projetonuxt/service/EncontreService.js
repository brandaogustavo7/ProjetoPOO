import http from "@/common/http";

class EncontreService {
    create(data) {
        console.log(data);
        return http.post("/CadastroAluno", data);
    }
    list() {
        return http.get("/conta");
    }
    delete(id) {
        return http.delete("/conta/" + id);
    }
    load(id) {
        return http.get("/conta/" + id);
    }
}
export default new EncontreService();
