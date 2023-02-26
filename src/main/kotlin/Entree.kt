class Entree(private var motFrancais: String, private var motAnglais: String) {

    fun setMotFrancais(motFrancais: String) {
        require(motFrancais.isNotBlank()) { "Le mot français ne peut pas être vide ou blanc" }
        this.motFrancais = motFrancais
    }

    fun setMotAnglais(motAnglais: String) {
        require(motAnglais.isNotBlank()) { "Le mot anglais ne peut pas être vide ou blanc" }
        this.motAnglais = motAnglais
    }

    fun getMotFrancais():String{
        return motFrancais
    }

    fun getMotAnglais():String{
        return motAnglais
    }

    override fun toString(): String {
        return "$motFrancais:$motAnglais"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entree) return false
        return motFrancais == other.motFrancais
    }

}
