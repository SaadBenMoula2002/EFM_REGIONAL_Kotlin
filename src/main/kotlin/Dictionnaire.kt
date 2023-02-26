class Dictionnaire {

    private val entrees = mutableListOf<Entree>()

    fun nombreEntrees(): Int {
        return entrees.size
    }

    fun ajouter(e: Entree) {
        require(!entrees.contains(e)) { "L'entrée existe déjà dans le dictionnaire" }
        entrees.add(e)
    }

    fun supprimer(e: Entree): Boolean {
        return entrees.remove(e)
    }

    fun supprimer(motFrancais: String): Boolean {
        val entree = entrees.find { it.getMotFrancais() == motFrancais }
        return entree?.let { entrees.remove(it) } ?: false
    }

    fun anFr(motAnglais: String): ArrayList<String> {
        val motsFrancais = arrayListOf<String>()
        for (entree in entrees) {
            if (entree.getMotAnglais() == motAnglais) {
                motsFrancais.add(entree.getMotFrancais())
            }
        }
        return motsFrancais
    }

    fun motsAnglais(): ArrayList<String> {
        val motsAnglais = hashSetOf<String>()
        for (entree in entrees) {
            motsAnglais.add(entree.getMotAnglais())
        }
        return ArrayList(motsAnglais)
    }

    fun dictionnaireAnFr(): Map<String, ArrayList<String>> {
        val dictionnaire = hashMapOf<String, ArrayList<String>>()
        for (entree in entrees) {
            val motsFrancais = dictionnaire.getOrDefault(entree.getMotAnglais(), arrayListOf())
            motsFrancais.add(entree.getMotFrancais())
            dictionnaire[entree.getMotAnglais()] = motsFrancais
        }
        return dictionnaire
    }

    override fun toString(): String {
        return entrees.joinToString("\n")
    }

}
