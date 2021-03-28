package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2300 - Trabalhador Sem Vínculo de Emprego/Estatutário - Início */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTSVInicio",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TSVInicio {

  /** Evento TSVE - Início */
  private EvtTSVInicio evtTSVInicio;

  /**
   * Evento TSVE - Início
   *
   * @return Conteúdo do campo evtTSVInicio
   */
  public EvtTSVInicio getEvtTSVInicio() {
    return this.evtTSVInicio;
  }

  /**
   * Evento TSVE - Início
   *
   * <p>DESCRICAO_COMPLETA:Evento Trabalhador Sem Vínculo de Emprego/Estatutário - Início.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_COMPATIBILIDADE_CATEGORIA_CLASSTRIB
   *
   * <p>REGRA:REGRA_COMPATIB_CATEG_EVENTO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EVETRAB_VALIDA_OPCAO_FGTS
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_MUDANCA_CPF
   *
   * <p>REGRA:REGRA_REGISTRO_PRELIMINAR
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_TSV_VERIFICA_DUPLICIDADE
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_MATRICULA
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * @return O objeto EvtTSVInicio para população dos campos filhos
   */
  public EvtTSVInicio<Evento_TSVInicio> setEvtTSVInicio() {
    if (this.evtTSVInicio == null) {
      this.evtTSVInicio = new EvtTSVInicio(this);
    }
    return this.evtTSVInicio;
  }

  /**
   * Evento TSVE - Início
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "trabalhador",
        "infoTSVInicio",
      })
  public static class EvtTSVInicio<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Grupo de informações do trabalhador. */
    private Trabalhador trabalhador;

    /** TSVE - Início */
    private InfoTSVInicio infoTSVInicio;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_trab<EvtTSVInicio<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_trab(this);
      }
      return this.ideEvento;
    }

    /**
     * Informações de identificação do empregador.
     *
     * @return Conteúdo do campo ideEmpregador
     */
    public Tipos.T_ideEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador para população dos campos filhos
     */
    public Tipos.T_ideEmpregador<EvtTSVInicio<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Grupo de informações do trabalhador.
     *
     * @return Conteúdo do campo trabalhador
     */
    public Trabalhador getTrabalhador() {
      return this.trabalhador;
    }

    /**
     * Grupo de informações do trabalhador.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}
     *
     * @return O objeto Trabalhador para população dos campos filhos
     */
    public Trabalhador<EvtTSVInicio<T>> setTrabalhador() {
      if (this.trabalhador == null) {
        this.trabalhador = new Trabalhador(this);
      }
      return this.trabalhador;
    }

    /**
     * TSVE - Início
     *
     * @return Conteúdo do campo infoTSVInicio
     */
    public InfoTSVInicio getInfoTSVInicio() {
      return this.infoTSVInicio;
    }

    /**
     * TSVE - Início
     *
     * <p>DESCRICAO_COMPLETA:Trabalhador Sem Vínculo de Emprego/Estatutário - TSVE - Início.
     *
     * <p>CHAVE_GRUPO: {matricula}, {codCateg}, {dtInicio}
     *
     * @return O objeto InfoTSVInicio para população dos campos filhos
     */
    public InfoTSVInicio<EvtTSVInicio<T>> setInfoTSVInicio() {
      if (this.infoTSVInicio == null) {
        this.infoTSVInicio = new InfoTSVInicio(this);
      }
      return this.infoTSVInicio;
    }

    public EvtTSVInicio(Object pai) {
      this.pai = pai;
    }

    @XmlTransient private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
    /**
     * Grupo de informações do trabalhador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfTrab",
          "nmTrab",
          "sexo",
          "racaCor",
          "estCiv",
          "grauInstr",
          "nmSoc",
          "nascimento",
          "endereco",
          "trabImig",
          "infoDeficiencia",
          "dependente",
          "contato",
        })
    public static class Trabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /** Informar o nome do trabalhador. */
      private String nmTrab;

      /** Sexo do trabalhador. */
      private String sexo;

      /** Raça e cor do trabalhador. */
      private String racaCor;

      /** Estado civil do trabalhador. */
      private String estCiv;

      /** Grau de instrução do trabalhador. */
      private String grauInstr;

      /** Nome social para travesti ou transexual. */
      private String nmSoc;

      /** Grupo de informações do nascimento do trabalhador. */
      private Tipos.T_nascimento nascimento;

      /** Endereço do trabalhador */
      private Endereco endereco;

      /** Informações do trabalhador imigrante. */
      private TrabImig trabImig;

      /** Pessoa com deficiência. */
      private InfoDeficiencia infoDeficiencia;

      /**
       * Informações dos dependentes.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<Dependente> dependente;

      /** Informações de contato. */
      private Tipos.T_contato contato;

      /**
       * Preencher com o número do CPF do trabalhador.
       *
       * @return Conteúdo do campo cpfTrab
       */
      public String getCpfTrab() {
        return this.cpfTrab;
      }

      /**
       * Preencher com o número do CPF do trabalhador.
       *
       * @param cpfTrab Valor para atribuir ao campo cpfTrab
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      /**
       * Informar o nome do trabalhador.
       *
       * @return Conteúdo do campo nmTrab
       */
      public String getNmTrab() {
        return this.nmTrab;
      }

      /**
       * Informar o nome do trabalhador.
       *
       * @param nmTrab Valor para atribuir ao campo nmTrab
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setNmTrab(String nmTrab) {
        this.nmTrab = nmTrab;
        return this;
      }

      /**
       * Sexo do trabalhador.
       *
       * @return Conteúdo do campo sexo
       */
      public String getSexo() {
        return this.sexo;
      }

      /**
       * Sexo do trabalhador.
       *
       * @param sexo Valor para atribuir ao campo sexo
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setSexo(String sexo) {
        if (!"M".equals(sexo) && !"F".equals(sexo))
          throw new RuntimeException(
              "Valor " + String.valueOf(sexo) + " inválido para o campo sexo");
        this.sexo = sexo;
        return this;
      }
      /**
       * Masculino
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setSexo_M() {
        this.sexo = "M";
        return this;
      }
      /**
       * Feminino
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setSexo_F() {
        this.sexo = "F";
        return this;
      }

      /**
       * Raça e cor do trabalhador.
       *
       * @return Conteúdo do campo racaCor
       */
      public String getRacaCor() {
        return this.racaCor;
      }

      /**
       * Raça e cor do trabalhador.
       *
       * @param racaCor Valor para atribuir ao campo racaCor
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor(String racaCor) {
        if (!"1".equals(racaCor)
            && !"2".equals(racaCor)
            && !"3".equals(racaCor)
            && !"4".equals(racaCor)
            && !"5".equals(racaCor)
            && !"6".equals(racaCor))
          throw new RuntimeException(
              "Valor " + String.valueOf(racaCor) + " inválido para o campo racaCor");
        this.racaCor = racaCor;
        return this;
      }
      /**
       * Branca
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_1() {
        this.racaCor = "1";
        return this;
      }
      /**
       * Preta
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_2() {
        this.racaCor = "2";
        return this;
      }
      /**
       * Parda
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_3() {
        this.racaCor = "3";
        return this;
      }
      /**
       * Amarela
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_4() {
        this.racaCor = "4";
        return this;
      }
      /**
       * Indígena
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_5() {
        this.racaCor = "5";
        return this;
      }
      /**
       * Não informado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_6() {
        this.racaCor = "6";
        return this;
      }

      /**
       * Estado civil do trabalhador.
       *
       * @return Conteúdo do campo estCiv
       */
      public String getEstCiv() {
        return this.estCiv;
      }

      /**
       * Estado civil do trabalhador.
       *
       * @param estCiv Valor para atribuir ao campo estCiv
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv(String estCiv) {
        if (!"1".equals(estCiv)
            && !"2".equals(estCiv)
            && !"3".equals(estCiv)
            && !"4".equals(estCiv)
            && !"5".equals(estCiv))
          throw new RuntimeException(
              "Valor " + String.valueOf(estCiv) + " inválido para o campo estCiv");
        this.estCiv = estCiv;
        return this;
      }
      /**
       * Solteiro
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_1() {
        this.estCiv = "1";
        return this;
      }
      /**
       * Casado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_2() {
        this.estCiv = "2";
        return this;
      }
      /**
       * Divorciado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_3() {
        this.estCiv = "3";
        return this;
      }
      /**
       * Separado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_4() {
        this.estCiv = "4";
        return this;
      }
      /**
       * Viúvo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_5() {
        this.estCiv = "5";
        return this;
      }

      /**
       * Grau de instrução do trabalhador.
       *
       * @return Conteúdo do campo grauInstr
       */
      public String getGrauInstr() {
        return this.grauInstr;
      }

      /**
       * Grau de instrução do trabalhador.
       *
       * @param grauInstr Valor para atribuir ao campo grauInstr
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr(String grauInstr) {
        if (!"01".equals(grauInstr)
            && !"02".equals(grauInstr)
            && !"03".equals(grauInstr)
            && !"04".equals(grauInstr)
            && !"05".equals(grauInstr)
            && !"06".equals(grauInstr)
            && !"07".equals(grauInstr)
            && !"08".equals(grauInstr)
            && !"09".equals(grauInstr)
            && !"10".equals(grauInstr)
            && !"11".equals(grauInstr)
            && !"12".equals(grauInstr))
          throw new RuntimeException(
              "Valor " + String.valueOf(grauInstr) + " inválido para o campo grauInstr");
        this.grauInstr = grauInstr;
        return this;
      }
      /**
       * Analfabeto, inclusive o que, embora tenha recebido instrução, não se alfabetizou
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_01() {
        this.grauInstr = "01";
        return this;
      }
      /**
       * Até o 5º ano incompleto do ensino fundamental (antiga 4ª série) ou que se tenha
       * alfabetizado sem ter frequentado escola regular
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_02() {
        this.grauInstr = "02";
        return this;
      }
      /**
       * 5º ano completo do ensino fundamental
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_03() {
        this.grauInstr = "03";
        return this;
      }
      /**
       * Do 6º ao 9º ano do ensino fundamental incompleto (antiga 5ª a 8ª série)
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_04() {
        this.grauInstr = "04";
        return this;
      }
      /**
       * Ensino fundamental completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_05() {
        this.grauInstr = "05";
        return this;
      }
      /**
       * Ensino médio incompleto
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_06() {
        this.grauInstr = "06";
        return this;
      }
      /**
       * Ensino médio completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_07() {
        this.grauInstr = "07";
        return this;
      }
      /**
       * Educação superior incompleta
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_08() {
        this.grauInstr = "08";
        return this;
      }
      /**
       * Educação superior completa
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_09() {
        this.grauInstr = "09";
        return this;
      }
      /**
       * Pós-graduação completa
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_10() {
        this.grauInstr = "10";
        return this;
      }
      /**
       * Mestrado completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_11() {
        this.grauInstr = "11";
        return this;
      }
      /**
       * Doutorado completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_12() {
        this.grauInstr = "12";
        return this;
      }

      /**
       * Nome social para travesti ou transexual.
       *
       * @return Conteúdo do campo nmSoc
       */
      public String getNmSoc() {
        return this.nmSoc;
      }

      /**
       * Nome social para travesti ou transexual.
       *
       * @param nmSoc Valor para atribuir ao campo nmSoc
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setNmSoc(String nmSoc) {
        this.nmSoc = nmSoc;
        return this;
      }

      /**
       * Grupo de informações do nascimento do trabalhador.
       *
       * @return Conteúdo do campo nascimento
       */
      public Tipos.T_nascimento getNascimento() {
        return this.nascimento;
      }

      /**
       * Grupo de informações do nascimento do trabalhador.
       *
       * @return O objeto Tipos.T_nascimento para população dos campos filhos
       */
      public Tipos.T_nascimento<Trabalhador<T>> setNascimento() {
        if (this.nascimento == null) {
          this.nascimento = new Tipos.T_nascimento(this);
        }
        return this.nascimento;
      }

      /**
       * Endereço do trabalhador
       *
       * @return Conteúdo do campo endereco
       */
      public Endereco getEndereco() {
        return this.endereco;
      }

      /**
       * Endereço do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Grupo de informações do endereço do trabalhador.
       *
       * @return O objeto Endereco para população dos campos filhos
       */
      public Endereco<Trabalhador<T>> setEndereco() {
        if (this.endereco == null) {
          this.endereco = new Endereco(this);
        }
        return this.endereco;
      }

      /**
       * Informações do trabalhador imigrante.
       *
       * @return Conteúdo do campo trabImig
       */
      public TrabImig getTrabImig() {
        return this.trabImig;
      }

      /**
       * Informações do trabalhador imigrante.
       *
       * <p>CONDICAO_GRUPO: OC (se {paisNac}(2300_trabalhador_nascimento_paisNac) for diferente de
       * [105]); N (nos demais casos)
       *
       * @return O objeto TrabImig para população dos campos filhos
       */
      public TrabImig<Trabalhador<T>> setTrabImig() {
        if (this.trabImig == null) {
          this.trabImig = new TrabImig(this);
        }
        return this.trabImig;
      }

      /**
       * Pessoa com deficiência.
       *
       * @return Conteúdo do campo infoDeficiencia
       */
      public InfoDeficiencia getInfoDeficiencia() {
        return this.infoDeficiencia;
      }

      /**
       * Pessoa com deficiência.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoDeficiencia para população dos campos filhos
       */
      public InfoDeficiencia<Trabalhador<T>> setInfoDeficiencia() {
        if (this.infoDeficiencia == null) {
          this.infoDeficiencia = new InfoDeficiencia(this);
        }
        return this.infoDeficiencia;
      }

      /**
       * Informações dos dependentes.
       *
       * @return Conteúdo do campo dependente
       */
      public java.util.List<Dependente> getDependente() {
        return this.dependente;
      }

      /**
       * Informações dos dependentes.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>CHAVE_GRUPO: {tpDep}, {nmDep}, {dtNascto}
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Dependente para população dos campos filhos
       */
      public Dependente<Trabalhador<T>> setDependente_Next() {
        if (this.dependente == null) {
          this.dependente = new java.util.ArrayList<>();
        }
        Dependente toAdd = new Dependente(this);
        this.dependente.add(toAdd);
        return toAdd;
      }

      /**
       * Informações de contato.
       *
       * @return Conteúdo do campo contato
       */
      public Tipos.T_contato getContato() {
        return this.contato;
      }

      /**
       * Informações de contato.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Tipos.T_contato para população dos campos filhos
       */
      public Tipos.T_contato<Trabalhador<T>> setContato() {
        if (this.contato == null) {
          this.contato = new Tipos.T_contato(this);
        }
        return this.contato;
      }

      public Trabalhador(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
      /**
       * Endereço do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "brasil",
            "exterior",
          })
      public static class Endereco<T> {

        /** Endereço no Brasil. */
        private Tipos.T_endereco_brasil brasil;

        /** Endereço no exterior. */
        private Tipos.T_endereco_exterior exterior;

        /**
         * Endereço no Brasil.
         *
         * @return Conteúdo do campo brasil
         */
        public Tipos.T_endereco_brasil getBrasil() {
          return this.brasil;
        }

        /**
         * Endereço no Brasil.
         *
         * <p>CONDICAO_GRUPO: O (se não informado o grupo {exterior}(../exterior)); N (nos demais
         * casos)
         *
         * @return O objeto Tipos.T_endereco_brasil para população dos campos filhos
         */
        public Tipos.T_endereco_brasil<Endereco<T>> setBrasil() {
          if (this.brasil == null) {
            this.brasil = new Tipos.T_endereco_brasil(this);
          }
          return this.brasil;
        }

        /**
         * Endereço no exterior.
         *
         * @return Conteúdo do campo exterior
         */
        public Tipos.T_endereco_exterior getExterior() {
          return this.exterior;
        }

        /**
         * Endereço no exterior.
         *
         * <p>CONDICAO_GRUPO: O (se não informado o grupo {brasil}(../brasil)); N (nos demais casos)
         *
         * @return O objeto Tipos.T_endereco_exterior para população dos campos filhos
         */
        public Tipos.T_endereco_exterior<Endereco<T>> setExterior() {
          if (this.exterior == null) {
            this.exterior = new Tipos.T_endereco_exterior(this);
          }
          return this.exterior;
        }

        public Endereco(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Informações do trabalhador imigrante.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tmpResid",
            "condIng",
          })
      public static class TrabImig<T> {

        /** Tempo de residência do trabalhador imigrante. */
        private String tmpResid;

        /** Condição de ingresso do trabalhador imigrante. */
        private String condIng;

        /**
         * Tempo de residência do trabalhador imigrante.
         *
         * @return Conteúdo do campo tmpResid
         */
        public String getTmpResid() {
          return this.tmpResid;
        }

        /**
         * Tempo de residência do trabalhador imigrante.
         *
         * <p>Validação: Preenchimento obrigatório se {dtInicio}(2300_infoTSVInicio_dtInicio) >=
         * [2021-05-10].
         *
         * @param tmpResid Valor para atribuir ao campo tmpResid
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setTmpResid(String tmpResid) {
          if (!"1".equals(tmpResid) && !"2".equals(tmpResid))
            throw new RuntimeException(
                "Valor " + String.valueOf(tmpResid) + " inválido para o campo tmpResid");
          this.tmpResid = tmpResid;
          return this;
        }
        /**
         * Prazo indeterminado
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setTmpResid_1() {
          this.tmpResid = "1";
          return this;
        }
        /**
         * Prazo determinado
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setTmpResid_2() {
          this.tmpResid = "2";
          return this;
        }

        /**
         * Condição de ingresso do trabalhador imigrante.
         *
         * @return Conteúdo do campo condIng
         */
        public String getCondIng() {
          return this.condIng;
        }

        /**
         * Condição de ingresso do trabalhador imigrante.
         *
         * <p>Validação: Se {tmpResid}(./tmpResid) = [1], não pode ser informado [2, 5]. Se
         * {tmpResid}(./tmpResid) = [2], não pode ser informado [1].
         *
         * @param condIng Valor para atribuir ao campo condIng
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng(String condIng) {
          if (!"1".equals(condIng)
              && !"2".equals(condIng)
              && !"3".equals(condIng)
              && !"4".equals(condIng)
              && !"5".equals(condIng)
              && !"6".equals(condIng)
              && !"7".equals(condIng))
            throw new RuntimeException(
                "Valor " + String.valueOf(condIng) + " inválido para o campo condIng");
          this.condIng = condIng;
          return this;
        }
        /**
         * Refugiado
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_1() {
          this.condIng = "1";
          return this;
        }
        /**
         * Solicitante de refúgio
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_2() {
          this.condIng = "2";
          return this;
        }
        /**
         * Permanência no Brasil em razão de reunião familiar
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_3() {
          this.condIng = "3";
          return this;
        }
        /**
         * Beneficiado pelo acordo entre países do Mercosul
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_4() {
          this.condIng = "4";
          return this;
        }
        /**
         * Dependente de agente diplomático e/ou consular de países que mantêm acordo de
         * reciprocidade para o exercício de atividade remunerada no Brasil
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_5() {
          this.condIng = "5";
          return this;
        }
        /**
         * Beneficiado pelo Tratado de Amizade, Cooperação e Consulta entre a República Federativa
         * do Brasil e a República Portuguesa
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_6() {
          this.condIng = "6";
          return this;
        }
        /**
         * Outra condição
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_7() {
          this.condIng = "7";
          return this;
        }

        public TrabImig(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Pessoa com deficiência.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "defFisica",
            "defVisual",
            "defAuditiva",
            "defMental",
            "defIntelectual",
            "reabReadap",
            "observacao",
          })
      public static class InfoDeficiencia<T> {

        /** Deficiência física. */
        private String defFisica;

        /** Deficiência visual. */
        private String defVisual;

        /** Deficiência auditiva. */
        private String defAuditiva;

        /** Deficiência mental. */
        private String defMental;

        /** Deficiência intelectual. */
        private String defIntelectual;

        /**
         * Informar se o trabalhador é reabilitado (empregado) ou readaptado (servidor
         * público/militar).
         */
        private String reabReadap;

        /** Observação. */
        private String observacao;

        /**
         * Deficiência física.
         *
         * @return Conteúdo do campo defFisica
         */
        public String getDefFisica() {
          return this.defFisica;
        }

        /**
         * Deficiência física.
         *
         * @param defFisica Valor para atribuir ao campo defFisica
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefFisica(String defFisica) {
          if (!"S".equals(defFisica) && !"N".equals(defFisica))
            throw new RuntimeException(
                "Valor " + String.valueOf(defFisica) + " inválido para o campo defFisica");
          this.defFisica = defFisica;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefFisica_S() {
          this.defFisica = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefFisica_N() {
          this.defFisica = "N";
          return this;
        }

        /**
         * Deficiência visual.
         *
         * @return Conteúdo do campo defVisual
         */
        public String getDefVisual() {
          return this.defVisual;
        }

        /**
         * Deficiência visual.
         *
         * @param defVisual Valor para atribuir ao campo defVisual
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefVisual(String defVisual) {
          if (!"S".equals(defVisual) && !"N".equals(defVisual))
            throw new RuntimeException(
                "Valor " + String.valueOf(defVisual) + " inválido para o campo defVisual");
          this.defVisual = defVisual;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefVisual_S() {
          this.defVisual = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefVisual_N() {
          this.defVisual = "N";
          return this;
        }

        /**
         * Deficiência auditiva.
         *
         * @return Conteúdo do campo defAuditiva
         */
        public String getDefAuditiva() {
          return this.defAuditiva;
        }

        /**
         * Deficiência auditiva.
         *
         * @param defAuditiva Valor para atribuir ao campo defAuditiva
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefAuditiva(String defAuditiva) {
          if (!"S".equals(defAuditiva) && !"N".equals(defAuditiva))
            throw new RuntimeException(
                "Valor " + String.valueOf(defAuditiva) + " inválido para o campo defAuditiva");
          this.defAuditiva = defAuditiva;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefAuditiva_S() {
          this.defAuditiva = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefAuditiva_N() {
          this.defAuditiva = "N";
          return this;
        }

        /**
         * Deficiência mental.
         *
         * @return Conteúdo do campo defMental
         */
        public String getDefMental() {
          return this.defMental;
        }

        /**
         * Deficiência mental.
         *
         * @param defMental Valor para atribuir ao campo defMental
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefMental(String defMental) {
          if (!"S".equals(defMental) && !"N".equals(defMental))
            throw new RuntimeException(
                "Valor " + String.valueOf(defMental) + " inválido para o campo defMental");
          this.defMental = defMental;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefMental_S() {
          this.defMental = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefMental_N() {
          this.defMental = "N";
          return this;
        }

        /**
         * Deficiência intelectual.
         *
         * @return Conteúdo do campo defIntelectual
         */
        public String getDefIntelectual() {
          return this.defIntelectual;
        }

        /**
         * Deficiência intelectual.
         *
         * @param defIntelectual Valor para atribuir ao campo defIntelectual
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefIntelectual(String defIntelectual) {
          if (!"S".equals(defIntelectual) && !"N".equals(defIntelectual))
            throw new RuntimeException(
                "Valor "
                    + String.valueOf(defIntelectual)
                    + " inválido para o campo defIntelectual");
          this.defIntelectual = defIntelectual;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefIntelectual_S() {
          this.defIntelectual = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefIntelectual_N() {
          this.defIntelectual = "N";
          return this;
        }

        /**
         * Informar se o trabalhador é reabilitado (empregado) ou readaptado (servidor
         * público/militar).
         *
         * @return Conteúdo do campo reabReadap
         */
        public String getReabReadap() {
          return this.reabReadap;
        }

        /**
         * Informar se o trabalhador é reabilitado (empregado) ou readaptado (servidor
         * público/militar).
         *
         * <p>Reabilitado: estando o empregado incapacitado parcial ou totalmente para o trabalho,
         * cumpriu programa de reabilitação profissional no INSS, recebendo certificado e sendo
         * proporcionados os meios indicados para participar do mercado de trabalho.
         *
         * <p>Readaptado: o servidor está investido em cargo de atribuições e responsabilidades
         * compatíveis com a limitação que tenha sofrido em sua capacidade física ou mental
         * verificada em inspeção médica.
         *
         * @param reabReadap Valor para atribuir ao campo reabReadap
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setReabReadap(String reabReadap) {
          if (!"S".equals(reabReadap) && !"N".equals(reabReadap))
            throw new RuntimeException(
                "Valor " + String.valueOf(reabReadap) + " inválido para o campo reabReadap");
          this.reabReadap = reabReadap;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setReabReadap_S() {
          this.reabReadap = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setReabReadap_N() {
          this.reabReadap = "N";
          return this;
        }

        /**
         * Observação.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public InfoDeficiencia(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Informações dos dependentes.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpDep",
            "nmDep",
            "dtNascto",
            "cpfDep",
            "depIRRF",
            "depSF",
            "incTrab",
          })
      public static class Dependente<T> {

        /** Tipo de dependente. */
        private String tpDep;

        /** Nome do dependente. */
        private String nmDep;

        /** Preencher com a data de nascimento. */
        private javax.xml.datatype.XMLGregorianCalendar dtNascto;

        /** Número de inscrição no CPF. */
        private String cpfDep;

        /**
         * Informar se é dependente do trabalhador para fins de dedução de seu rendimento tributável
         * pelo Imposto de Renda.
         */
        private String depIRRF;

        /** Informar se é dependente para fins de recebimento do benefício de salário-família. */
        private String depSF;

        /** Informar se o dependente tem incapacidade física ou mental para o trabalho. */
        private String incTrab;

        /**
         * Tipo de dependente.
         *
         * @return Conteúdo do campo tpDep
         */
        public String getTpDep() {
          return this.tpDep;
        }

        /**
         * Tipo de dependente.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 07.
         *
         * @param tpDep Valor para atribuir ao campo tpDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setTpDep(String tpDep) {
          this.tpDep = tpDep;
          return this;
        }

        /**
         * Nome do dependente.
         *
         * @return Conteúdo do campo nmDep
         */
        public String getNmDep() {
          return this.nmDep;
        }

        /**
         * Nome do dependente.
         *
         * @param nmDep Valor para atribuir ao campo nmDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setNmDep(String nmDep) {
          this.nmDep = nmDep;
          return this;
        }

        /**
         * Preencher com a data de nascimento.
         *
         * @return Conteúdo do campo dtNascto
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtNascto() {
          return this.dtNascto;
        }

        /**
         * Preencher com a data de nascimento.
         *
         * <p>Validação: Deve ser maior ou igual que 01/01/1890 e menor ou igual à data atual.
         *
         * @param dtNascto Valor para atribuir ao campo dtNascto
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
          this.dtNascto = dtNascto;
          return this;
        }

        /**
         * Número de inscrição no CPF.
         *
         * @return Conteúdo do campo cpfDep
         */
        public String getCpfDep() {
          return this.cpfDep;
        }

        /**
         * Número de inscrição no CPF.
         *
         * <p>Validação: Deve ser um número de CPF válido, observando o que segue:
         *
         * <p>a) O preenchimento é obrigatório se {depIRRF}(./depIRRF) = [S];
         *
         * <p>b) Em arquivo de empregador Pessoa Física, deve ser diferente do CPF informado em
         * {ideEmpregador}(/ideEmpregador);
         *
         * <p>c) Não pode haver mais de um dependente com o mesmo número de CPF.
         *
         * @param cpfDep Valor para atribuir ao campo cpfDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setCpfDep(String cpfDep) {
          this.cpfDep = cpfDep;
          return this;
        }

        /**
         * Informar se é dependente do trabalhador para fins de dedução de seu rendimento tributável
         * pelo Imposto de Renda.
         *
         * @return Conteúdo do campo depIRRF
         */
        public String getDepIRRF() {
          return this.depIRRF;
        }

        /**
         * Informar se é dependente do trabalhador para fins de dedução de seu rendimento tributável
         * pelo Imposto de Renda.
         *
         * @param depIRRF Valor para atribuir ao campo depIRRF
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepIRRF(String depIRRF) {
          if (!"S".equals(depIRRF) && !"N".equals(depIRRF))
            throw new RuntimeException(
                "Valor " + String.valueOf(depIRRF) + " inválido para o campo depIRRF");
          this.depIRRF = depIRRF;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepIRRF_S() {
          this.depIRRF = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepIRRF_N() {
          this.depIRRF = "N";
          return this;
        }

        /**
         * Informar se é dependente para fins de recebimento do benefício de salário-família.
         *
         * @return Conteúdo do campo depSF
         */
        public String getDepSF() {
          return this.depSF;
        }

        /**
         * Informar se é dependente para fins de recebimento do benefício de salário-família.
         *
         * @param depSF Valor para atribuir ao campo depSF
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepSF(String depSF) {
          if (!"S".equals(depSF) && !"N".equals(depSF))
            throw new RuntimeException(
                "Valor " + String.valueOf(depSF) + " inválido para o campo depSF");
          this.depSF = depSF;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepSF_S() {
          this.depSF = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepSF_N() {
          this.depSF = "N";
          return this;
        }

        /**
         * Informar se o dependente tem incapacidade física ou mental para o trabalho.
         *
         * @return Conteúdo do campo incTrab
         */
        public String getIncTrab() {
          return this.incTrab;
        }

        /**
         * Informar se o dependente tem incapacidade física ou mental para o trabalho.
         *
         * @param incTrab Valor para atribuir ao campo incTrab
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setIncTrab(String incTrab) {
          if (!"S".equals(incTrab) && !"N".equals(incTrab))
            throw new RuntimeException(
                "Valor " + String.valueOf(incTrab) + " inválido para o campo incTrab");
          this.incTrab = incTrab;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setIncTrab_S() {
          this.incTrab = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setIncTrab_N() {
          this.incTrab = "N";
          return this;
        }

        public Dependente(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }
    }

    /**
     * TSVE - Início
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cadIni",
          "matricula",
          "codCateg",
          "dtInicio",
          "nrProcTrab",
          "natAtividade",
          "infoComplementares",
          "mudancaCPF",
          "afastamento",
          "termino",
        })
    public static class InfoTSVInicio<T> {

      /**
       * Indicar se o evento se refere a cadastramento inicial (o ingresso do trabalhador no
       * empregador declarante é anterior à data de início da obrigatoriedade de envio de seus
       * eventos não periódicos) ou se refere a início de TSVE (o ingresso do trabalhador no
       * empregador declarante é igual ou posterior à data de início da obrigatoriedade de envio de
       * seus eventos não periódicos).
       */
      private String cadIni;

      /** Matrícula atribuída ao trabalhador pela empresa. */
      private String matricula;

      /** Preencher com o código da categoria do trabalhador. */
      private Integer codCateg;

      /** Data de início, que pode ser: */
      private javax.xml.datatype.XMLGregorianCalendar dtInicio;

      /**
       * Número que identifica o processo trabalhista, quando o início de TSVE se der por decisão
       * judicial.
       */
      private String nrProcTrab;

      /** Natureza da atividade. */
      private String natAtividade;

      /** Informações complementares */
      private InfoComplementares infoComplementares;

      /** Informações de mudança de CPF do trabalhador. */
      private MudancaCPF mudancaCPF;

      /** Informações de afastamento do TSVE */
      private Afastamento afastamento;

      /** Informação do término do TSVE */
      private Termino termino;

      /**
       * Indicar se o evento se refere a cadastramento inicial (o ingresso do trabalhador no
       * empregador declarante é anterior à data de início da obrigatoriedade de envio de seus
       * eventos não periódicos) ou se refere a início de TSVE (o ingresso do trabalhador no
       * empregador declarante é igual ou posterior à data de início da obrigatoriedade de envio de
       * seus eventos não periódicos).
       *
       * @return Conteúdo do campo cadIni
       */
      public String getCadIni() {
        return this.cadIni;
      }

      /**
       * Indicar se o evento se refere a cadastramento inicial (o ingresso do trabalhador no
       * empregador declarante é anterior à data de início da obrigatoriedade de envio de seus
       * eventos não periódicos) ou se refere a início de TSVE (o ingresso do trabalhador no
       * empregador declarante é igual ou posterior à data de início da obrigatoriedade de envio de
       * seus eventos não periódicos).
       *
       * @param cadIni Valor para atribuir ao campo cadIni
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setCadIni(String cadIni) {
        if (!"S".equals(cadIni) && !"N".equals(cadIni))
          throw new RuntimeException(
              "Valor " + String.valueOf(cadIni) + " inválido para o campo cadIni");
        this.cadIni = cadIni;
        return this;
      }
      /**
       * Sim (Cadastramento Inicial)
       *
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setCadIni_S() {
        this.cadIni = "S";
        return this;
      }
      /**
       * Não (Início de TSVE)
       *
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setCadIni_N() {
        this.cadIni = "N";
        return this;
      }

      /**
       * Matrícula atribuída ao trabalhador pela empresa.
       *
       * @return Conteúdo do campo matricula
       */
      public String getMatricula() {
        return this.matricula;
      }

      /**
       * Matrícula atribuída ao trabalhador pela empresa.
       *
       * <p>Validação: Preenchimento obrigatório se {indRetif}(2300_ideEvento_indRetif) = [1]. No
       * caso de retificação ({indRetif}(2300_ideEvento_indRetif) = [2]), a matrícula deve ser
       * preenchida caso tenha sido informada no evento original.
       *
       * <p>O valor informado não pode conter a expressão 'eSocial' nas 7 (sete) primeiras posições.
       *
       * <p>REGRA:REGRA_CARACTERE_ESPECIAL
       *
       * @param matricula Valor para atribuir ao campo matricula
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
      }

      /**
       * Preencher com o código da categoria do trabalhador.
       *
       * @return Conteúdo do campo codCateg
       */
      public Integer getCodCateg() {
        return this.codCateg;
      }

      /**
       * Preencher com o código da categoria do trabalhador.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela 01.
       *
       * @param codCateg Valor para atribuir ao campo codCateg
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setCodCateg(Integer codCateg) {
        this.codCateg = codCateg;
        return this;
      }

      /**
       * Data de início, que pode ser:
       *
       * @return Conteúdo do campo dtInicio
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtInicio() {
        return this.dtInicio;
      }

      /**
       * Data de início, que pode ser:
       *
       * <p>a) Para o cooperado, a data de ingresso na cooperativa;
       *
       * <p>b) Para o diretor não empregado, a data de posse no cargo;
       *
       * <p>c) Para o dirigente sindical, a data de início do mandato no sindicato;
       *
       * <p>d) Para o estagiário, a data de início do estágio;
       *
       * <p>e) Para o trabalhador avulso, a data de ingresso no Órgão Gestor de Mão de Obra - OGMO
       * ou no sindicato;
       *
       * <p>f) Para o servidor público exercente de cargo eletivo, a data de início do mandato;
       *
       * <p>g) Para os demais trabalhadores, a data de início das atividades.
       *
       * <p>Validação: Devem ser observadas as seguintes regras:
       *
       * <p>a) Deve ser posterior à data de nascimento do trabalhador e não pode ser posterior a 30
       * (trinta) dias da data atual;
       *
       * <p>b) Se {cadIni}(./cadIni) = [S], deve ser anterior à data de início da obrigatoriedade
       * dos eventos não periódicos para o empregador no eSocial;
       *
       * <p>c) Se {cadIni}(./cadIni) = [N], deve ser igual ou posterior à data de início da
       * obrigatoriedade dos eventos não periódicos para o empregador no eSocial.
       *
       * @param dtInicio Valor para atribuir ao campo dtInicio
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setDtInicio(javax.xml.datatype.XMLGregorianCalendar dtInicio) {
        this.dtInicio = dtInicio;
        return this;
      }

      /**
       * Número que identifica o processo trabalhista, quando o início de TSVE se der por decisão
       * judicial.
       *
       * @return Conteúdo do campo nrProcTrab
       */
      public String getNrProcTrab() {
        return this.nrProcTrab;
      }

      /**
       * Número que identifica o processo trabalhista, quando o início de TSVE se der por decisão
       * judicial.
       *
       * <p>Validação: Se preenchido, deve ser um processo judicial válido, com 20 (vinte)
       * algarismos.
       *
       * @param nrProcTrab Valor para atribuir ao campo nrProcTrab
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setNrProcTrab(String nrProcTrab) {
        this.nrProcTrab = nrProcTrab;
        return this;
      }

      /**
       * Natureza da atividade.
       *
       * @return Conteúdo do campo natAtividade
       */
      public String getNatAtividade() {
        return this.natAtividade;
      }

      /**
       * Natureza da atividade.
       *
       * <p>Validação: Preenchimento obrigatório se {codCateg}(./codCateg) = [201, 202, 401, 731,
       * 734, 738]. Não deve ser preenchido se {codCateg}(./codCateg) = [721, 722, 771, 901].
       *
       * @param natAtividade Valor para atribuir ao campo natAtividade
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setNatAtividade(String natAtividade) {
        if (!"1".equals(natAtividade) && !"2".equals(natAtividade))
          throw new RuntimeException(
              "Valor " + String.valueOf(natAtividade) + " inválido para o campo natAtividade");
        this.natAtividade = natAtividade;
        return this;
      }
      /**
       * Trabalho urbano
       *
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setNatAtividade_1() {
        this.natAtividade = "1";
        return this;
      }
      /**
       * Trabalho rural
       *
       * @return O próprio InfoTSVInicio para continuar populando outros campos
       */
      public InfoTSVInicio<T> setNatAtividade_2() {
        this.natAtividade = "2";
        return this;
      }

      /**
       * Informações complementares
       *
       * @return Conteúdo do campo infoComplementares
       */
      public InfoComplementares getInfoComplementares() {
        return this.infoComplementares;
      }

      /**
       * Informações complementares
       *
       * <p>DESCRICAO_COMPLETA:Grupo onde são fornecidas informações complementares, preenchidas
       * conforme a categoria do TSVE.
       *
       * <p>CONDICAO_GRUPO: O (de acordo com a condição dos grupos inferiores); OC (nos demais
       * casos)
       *
       * @return O objeto InfoComplementares para população dos campos filhos
       */
      public InfoComplementares<InfoTSVInicio<T>> setInfoComplementares() {
        if (this.infoComplementares == null) {
          this.infoComplementares = new InfoComplementares(this);
        }
        return this.infoComplementares;
      }

      /**
       * Informações de mudança de CPF do trabalhador.
       *
       * @return Conteúdo do campo mudancaCPF
       */
      public MudancaCPF getMudancaCPF() {
        return this.mudancaCPF;
      }

      /**
       * Informações de mudança de CPF do trabalhador.
       *
       * <p>CONDICAO_GRUPO: N (se {cadIni}(2300_infoTSVInicio_cadIni) = [S]); OC (nos demais casos)
       *
       * @return O objeto MudancaCPF para população dos campos filhos
       */
      public MudancaCPF<InfoTSVInicio<T>> setMudancaCPF() {
        if (this.mudancaCPF == null) {
          this.mudancaCPF = new MudancaCPF(this);
        }
        return this.mudancaCPF;
      }

      /**
       * Informações de afastamento do TSVE
       *
       * @return Conteúdo do campo afastamento
       */
      public Afastamento getAfastamento() {
        return this.afastamento;
      }

      /**
       * Informações de afastamento do TSVE
       *
       * <p>DESCRICAO_COMPLETA:Informações de afastamento do TSVE.
       *
       * <p>Preenchimento exclusivo em caso de trabalhador que permaneça afastado na data de início
       * da obrigatoriedade dos eventos não periódicos para o empregador no eSocial ou na data de
       * alteração do CPF.
       *
       * <p>CONDICAO_GRUPO: N (se grupo {termino}(2300_infoTSVInicio_termino) estiver preenchido);
       * OC (nos demais casos)
       *
       * @return O objeto Afastamento para população dos campos filhos
       */
      public Afastamento<InfoTSVInicio<T>> setAfastamento() {
        if (this.afastamento == null) {
          this.afastamento = new Afastamento(this);
        }
        return this.afastamento;
      }

      /**
       * Informação do término do TSVE
       *
       * @return Conteúdo do campo termino
       */
      public Termino getTermino() {
        return this.termino;
      }

      /**
       * Informação do término do TSVE
       *
       * <p>DESCRICAO_COMPLETA:Informação do término do TSVE.
       *
       * <p>Grupo preenchido exclusivamente caso seja necessário enviar cadastramento inicial
       * referente a trabalhador com data de término anterior ao início dos eventos não periódicos
       * para o empregador no eSocial (por exemplo, envio para pagamento de retiradas em meses
       * posteriores à data de término e sob vigência dos eventos periódicos para o empregador no
       * eSocial).
       *
       * <p>CONDICAO_GRUPO: N (se {cadIni}(2300_infoTSVInicio_cadIni) = [N] ou grupo
       * {afastamento}(2300_infoTSVInicio_afastamento) estiver preenchido); OC (nos demais casos)
       *
       * @return O objeto Termino para população dos campos filhos
       */
      public Termino<InfoTSVInicio<T>> setTermino() {
        if (this.termino == null) {
          this.termino = new Termino(this);
        }
        return this.termino;
      }

      public InfoTSVInicio(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
      /**
       * Informações complementares
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cargoFuncao",
            "remuneracao",
            "FGTS",
            "infoDirigenteSindical",
            "infoTrabCedido",
            "infoMandElet",
            "infoEstagiario",
          })
      public static class InfoComplementares<T> {

        /** Cargo/Função ocupado pelo TSVE */
        private CargoFuncao cargoFuncao;

        /** Informações da remuneração e periodicidade de pagamento. */
        private Tipos.T_remuneracao remuneracao;

        /** Informações do FGTS */
        private FGTS FGTS;

        /** Informações relativas ao dirigente sindical. */
        private InfoDirigenteSindical infoDirigenteSindical;

        /** Informações relativas ao trabalhador cedido/em exercício em outro órgão */
        private InfoTrabCedido infoTrabCedido;

        /** Informações relativas a servidor público exercente de mandato eletivo. */
        private InfoMandElet infoMandElet;

        /** Informações relativas ao estagiário. */
        private Tipos.T_infoEstagiario infoEstagiario;

        /**
         * Cargo/Função ocupado pelo TSVE
         *
         * @return Conteúdo do campo cargoFuncao
         */
        public CargoFuncao getCargoFuncao() {
          return this.cargoFuncao;
        }

        /**
         * Cargo/Função ocupado pelo TSVE
         *
         * <p>DESCRICAO_COMPLETA:Grupo que apresenta o cargo e/ou função ocupada pelo TSVE.
         *
         * <p>CONDICAO_GRUPO: OC (se {codCateg}(2300_infoTSVInicio_codCateg) = [901, 903, 904]); O
         * (nos demais casos)
         *
         * @return O objeto CargoFuncao para população dos campos filhos
         */
        public CargoFuncao<InfoComplementares<T>> setCargoFuncao() {
          if (this.cargoFuncao == null) {
            this.cargoFuncao = new CargoFuncao(this);
          }
          return this.cargoFuncao;
        }

        /**
         * Informações da remuneração e periodicidade de pagamento.
         *
         * @return Conteúdo do campo remuneracao
         */
        public Tipos.T_remuneracao getRemuneracao() {
          return this.remuneracao;
        }

        /**
         * Informações da remuneração e periodicidade de pagamento.
         *
         * <p>CONDICAO_GRUPO: O (se {codCateg}(2300_infoTSVInicio_codCateg) = [721, 722, 771]); OC
         * (nos demais casos)
         *
         * @return O objeto Tipos.T_remuneracao para população dos campos filhos
         */
        public Tipos.T_remuneracao<InfoComplementares<T>> setRemuneracao() {
          if (this.remuneracao == null) {
            this.remuneracao = new Tipos.T_remuneracao(this);
          }
          return this.remuneracao;
        }

        /**
         * Informações do FGTS
         *
         * @return Conteúdo do campo FGTS
         */
        public FGTS getFGTS() {
          return this.FGTS;
        }

        /**
         * Informações do FGTS
         *
         * <p>DESCRICAO_COMPLETA:Informações do Fundo de Garantia do Tempo de Serviço - FGTS.
         *
         * <p>CONDICAO_GRUPO: O (se {codCateg}(2300_infoTSVInicio_codCateg) = [721]); N (nos demais
         * casos)
         *
         * @return O objeto FGTS para população dos campos filhos
         */
        public FGTS<InfoComplementares<T>> setFGTS() {
          if (this.FGTS == null) {
            this.FGTS = new FGTS(this);
          }
          return this.FGTS;
        }

        /**
         * Informações relativas ao dirigente sindical.
         *
         * @return Conteúdo do campo infoDirigenteSindical
         */
        public InfoDirigenteSindical getInfoDirigenteSindical() {
          return this.infoDirigenteSindical;
        }

        /**
         * Informações relativas ao dirigente sindical.
         *
         * <p>CONDICAO_GRUPO: O (se {codCateg}(2300_infoTSVInicio_codCateg) = [401]); N (nos demais
         * casos)
         *
         * @return O objeto InfoDirigenteSindical para população dos campos filhos
         */
        public InfoDirigenteSindical<InfoComplementares<T>> setInfoDirigenteSindical() {
          if (this.infoDirigenteSindical == null) {
            this.infoDirigenteSindical = new InfoDirigenteSindical(this);
          }
          return this.infoDirigenteSindical;
        }

        /**
         * Informações relativas ao trabalhador cedido/em exercício em outro órgão
         *
         * @return Conteúdo do campo infoTrabCedido
         */
        public InfoTrabCedido getInfoTrabCedido() {
          return this.infoTrabCedido;
        }

        /**
         * Informações relativas ao trabalhador cedido/em exercício em outro órgão
         *
         * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalhador cedido/em exercício em outro
         * órgão, preenchidas exclusivamente pelo cessionário/órgão de destino.
         *
         * <p>CONDICAO_GRUPO: O (se {codCateg}(2300_infoTSVInicio_codCateg) = [410]); N (nos demais
         * casos)
         *
         * @return O objeto InfoTrabCedido para população dos campos filhos
         */
        public InfoTrabCedido<InfoComplementares<T>> setInfoTrabCedido() {
          if (this.infoTrabCedido == null) {
            this.infoTrabCedido = new InfoTrabCedido(this);
          }
          return this.infoTrabCedido;
        }

        /**
         * Informações relativas a servidor público exercente de mandato eletivo.
         *
         * @return Conteúdo do campo infoMandElet
         */
        public InfoMandElet getInfoMandElet() {
          return this.infoMandElet;
        }

        /**
         * Informações relativas a servidor público exercente de mandato eletivo.
         *
         * <p>CONDICAO_GRUPO: O (se {codCateg}(2300_infoTSVInicio_codCateg) = [304]); N (nos demais
         * casos)
         *
         * @return O objeto InfoMandElet para população dos campos filhos
         */
        public InfoMandElet<InfoComplementares<T>> setInfoMandElet() {
          if (this.infoMandElet == null) {
            this.infoMandElet = new InfoMandElet(this);
          }
          return this.infoMandElet;
        }

        /**
         * Informações relativas ao estagiário.
         *
         * @return Conteúdo do campo infoEstagiario
         */
        public Tipos.T_infoEstagiario getInfoEstagiario() {
          return this.infoEstagiario;
        }

        /**
         * Informações relativas ao estagiário.
         *
         * <p>CONDICAO_GRUPO: O (se {codCateg}(2300_infoTSVInicio_codCateg) = [901]); N (nos demais
         * casos)
         *
         * @return O objeto Tipos.T_infoEstagiario para população dos campos filhos
         */
        public Tipos.T_infoEstagiario<InfoComplementares<T>> setInfoEstagiario() {
          if (this.infoEstagiario == null) {
            this.infoEstagiario = new Tipos.T_infoEstagiario(this);
          }
          return this.infoEstagiario;
        }

        public InfoComplementares(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
        /**
         * Cargo/Função ocupado pelo TSVE
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nmCargo",
              "CBOCargo",
              "nmFuncao",
              "CBOFuncao",
            })
        public static class CargoFuncao<T> {

          /** Informar o nome do cargo. */
          private String nmCargo;

          /** Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo. */
          private String CBOCargo;

          /** Informar o nome da função de confiança. */
          private String nmFuncao;

          /** Informar a CBO relativa à função de confiança/cargo em comissão. */
          private String CBOFuncao;

          /**
           * Informar o nome do cargo.
           *
           * @return Conteúdo do campo nmCargo
           */
          public String getNmCargo() {
            return this.nmCargo;
          }

          /**
           * Informar o nome do cargo.
           *
           * <p>Validação: Preenchimento obrigatório se {codCateg}(2300_infoTSVInicio_codCateg) for
           * diferente de [410].
           *
           * @param nmCargo Valor para atribuir ao campo nmCargo
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setNmCargo(String nmCargo) {
            this.nmCargo = nmCargo;
            return this;
          }

          /**
           * Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo.
           *
           * @return Conteúdo do campo CBOCargo
           */
          public String getCBOCargo() {
            return this.CBOCargo;
          }

          /**
           * Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {nmCargo}(./nmCargo) for
           * preenchido. Se informado, deve ser um código válido e existente na tabela de CBO, com 6
           * (seis) posições.
           *
           * @param CBOCargo Valor para atribuir ao campo CBOCargo
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setCBOCargo(String CBOCargo) {
            this.CBOCargo = CBOCargo;
            return this;
          }

          /**
           * Informar o nome da função de confiança.
           *
           * @return Conteúdo do campo nmFuncao
           */
          public String getNmFuncao() {
            return this.nmFuncao;
          }

          /**
           * Informar o nome da função de confiança.
           *
           * <p>Validação: Preenchimento obrigatório se {codCateg}(2300_infoTSVInicio_codCateg) =
           * [410] e não houver informação de {nmCargo}(./nmCargo).
           *
           * @param nmFuncao Valor para atribuir ao campo nmFuncao
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setNmFuncao(String nmFuncao) {
            this.nmFuncao = nmFuncao;
            return this;
          }

          /**
           * Informar a CBO relativa à função de confiança/cargo em comissão.
           *
           * @return Conteúdo do campo CBOFuncao
           */
          public String getCBOFuncao() {
            return this.CBOFuncao;
          }

          /**
           * Informar a CBO relativa à função de confiança/cargo em comissão.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {nmFuncao}(./nmFuncao) for
           * preenchido. Se informado, deve ser um código válido e existente na tabela de CBO, com 6
           * (seis) posições.
           *
           * @param CBOFuncao Valor para atribuir ao campo CBOFuncao
           * @return O próprio CargoFuncao para continuar populando outros campos
           */
          public CargoFuncao<T> setCBOFuncao(String CBOFuncao) {
            this.CBOFuncao = CBOFuncao;
            return this;
          }

          public CargoFuncao(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
        }

        /**
         * Informações do FGTS
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "dtOpcFGTS",
            })
        public static class FGTS<T> {

          /** Informar a data de opção do trabalhador pelo FGTS. */
          private javax.xml.datatype.XMLGregorianCalendar dtOpcFGTS;

          /**
           * Informar a data de opção do trabalhador pelo FGTS.
           *
           * @return Conteúdo do campo dtOpcFGTS
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtOpcFGTS() {
            return this.dtOpcFGTS;
          }

          /**
           * Informar a data de opção do trabalhador pelo FGTS.
           *
           * @param dtOpcFGTS Valor para atribuir ao campo dtOpcFGTS
           * @return O próprio FGTS para continuar populando outros campos
           */
          public FGTS<T> setDtOpcFGTS(javax.xml.datatype.XMLGregorianCalendar dtOpcFGTS) {
            this.dtOpcFGTS = dtOpcFGTS;
            return this;
          }

          public FGTS(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
        }

        /**
         * Informações relativas ao dirigente sindical.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "categOrig",
              "tpInsc",
              "nrInsc",
              "dtAdmOrig",
              "matricOrig",
              "tpRegTrab",
              "tpRegPrev",
            })
        public static class InfoDirigenteSindical<T> {

          /** Preencher com o código correspondente à categoria de origem do dirigente sindical. */
          private Integer categOrig;

          /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
          private String tpInsc;

          /**
           * Informar o número de inscrição do empregador de origem do dirigente sindical, de acordo
           * com o tipo de inscrição indicado no campo {infoDirigenteSindical/tpInsc}(./tpInsc).
           */
          private String nrInsc;

          /**
           * Preencher com a data de admissão (ou de início) do dirigente sindical na empresa de
           * origem.
           */
          private javax.xml.datatype.XMLGregorianCalendar dtAdmOrig;

          /** Preencher com a matrícula do trabalhador na empresa de origem. */
          private String matricOrig;

          /** Tipo de regime trabalhista. */
          private String tpRegTrab;

          /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
          private String tpRegPrev;

          /**
           * Preencher com o código correspondente à categoria de origem do dirigente sindical.
           *
           * @return Conteúdo do campo categOrig
           */
          public Integer getCategOrig() {
            return this.categOrig;
          }

          /**
           * Preencher com o código correspondente à categoria de origem do dirigente sindical.
           *
           * <p>Validação: Deve ser um código válido e existente na Tabela 01, diferente de [401].
           *
           * @param categOrig Valor para atribuir ao campo categOrig
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setCategOrig(Integer categOrig) {
            this.categOrig = categOrig;
            return this;
          }

          /**
           * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
           *
           * @return Conteúdo do campo tpInsc
           */
          public String getTpInsc() {
            return this.tpInsc;
          }

          /**
           * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
           *
           * <p>Validação: O preenchimento é obrigatório e exclusivo se
           * {infoDirigenteSindical/categOrig}(./categOrig) corresponder a "Empregado", "Agente
           * Público", "Avulso" ou for igual a [721].
           *
           * @param tpInsc Valor para atribuir ao campo tpInsc
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
            this.tpInsc = tpInsc;
            return this;
          }
          /**
           * CNPJ
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpInsc_1() {
            this.tpInsc = "1";
            return this;
          }
          /**
           * CPF
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpInsc_2() {
            this.tpInsc = "2";
            return this;
          }

          /**
           * Informar o número de inscrição do empregador de origem do dirigente sindical, de acordo
           * com o tipo de inscrição indicado no campo {infoDirigenteSindical/tpInsc}(./tpInsc).
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Informar o número de inscrição do empregador de origem do dirigente sindical, de acordo
           * com o tipo de inscrição indicado no campo {infoDirigenteSindical/tpInsc}(./tpInsc).
           *
           * <p>Validação: Preenchimento obrigatório e exclusivo se
           * {infoDirigenteSindical/tpInsc}(./tpInsc) for informado. Se preenchido, deve ser um
           * número de inscrição válido e diferente da inscrição do declarante, considerando as
           * particularidades aplicadas à informação de CNPJ de órgão público em S-1000.
           *
           * <p>Se {infoDirigenteSindical/tpInsc}(./tpInsc) = [1], deve possuir 14 (catorze)
           * algarismos e ser diferente do CNPJ base do empregador e dos estabelecimentos informados
           * através do evento S-1005.
           *
           * <p>Se {infoDirigenteSindical/tpInsc}(./tpInsc) = [2], deve possuir 11 (onze)
           * algarismos.
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          /**
           * Preencher com a data de admissão (ou de início) do dirigente sindical na empresa de
           * origem.
           *
           * @return Conteúdo do campo dtAdmOrig
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtAdmOrig() {
            return this.dtAdmOrig;
          }

          /**
           * Preencher com a data de admissão (ou de início) do dirigente sindical na empresa de
           * origem.
           *
           * <p>Validação: O preenchimento é obrigatório se
           * {infoDirigenteSindical/categOrig}(./categOrig) corresponder a "Empregado", "Agente
           * Público", "Avulso" ou for igual a [721].
           *
           * @param dtAdmOrig Valor para atribuir ao campo dtAdmOrig
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setDtAdmOrig(
              javax.xml.datatype.XMLGregorianCalendar dtAdmOrig) {
            this.dtAdmOrig = dtAdmOrig;
            return this;
          }

          /**
           * Preencher com a matrícula do trabalhador na empresa de origem.
           *
           * @return Conteúdo do campo matricOrig
           */
          public String getMatricOrig() {
            return this.matricOrig;
          }

          /**
           * Preencher com a matrícula do trabalhador na empresa de origem.
           *
           * <p>Validação: Preenchimento obrigatório se
           * {infoDirigenteSindical/categOrig}(./categOrig) corresponder a "Empregado" ou "Agente
           * Público".
           *
           * @param matricOrig Valor para atribuir ao campo matricOrig
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setMatricOrig(String matricOrig) {
            this.matricOrig = matricOrig;
            return this;
          }

          /**
           * Tipo de regime trabalhista.
           *
           * @return Conteúdo do campo tpRegTrab
           */
          public String getTpRegTrab() {
            return this.tpRegTrab;
          }

          /**
           * Tipo de regime trabalhista.
           *
           * <p>Validação: O preenchimento é obrigatório e exclusivo se
           * {infoDirigenteSindical/categOrig}(./categOrig) corresponder a "Empregado" ou "Agente
           * Público".
           *
           * @param tpRegTrab Valor para atribuir ao campo tpRegTrab
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegTrab(String tpRegTrab) {
            if (!"1".equals(tpRegTrab) && !"2".equals(tpRegTrab))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegTrab) + " inválido para o campo tpRegTrab");
            this.tpRegTrab = tpRegTrab;
            return this;
          }
          /**
           * CLT - Consolidação das Leis de Trabalho e legislações trabalhistas específicas
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegTrab_1() {
            this.tpRegTrab = "1";
            return this;
          }
          /**
           * Estatutário/legislações específicas (servidor temporário, militar, agente político,
           * etc.)
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegTrab_2() {
            this.tpRegTrab = "2";
            return this;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @return Conteúdo do campo tpRegPrev
           */
          public String getTpRegPrev() {
            return this.tpRegPrev;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * <p>Validação: Se {infoDirigenteSindical/categOrig}(./categOrig) for relativa a
           * "Empregado", não pode ser preenchido com [2].
           *
           * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev(String tpRegPrev) {
            if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
            this.tpRegPrev = tpRegPrev;
            return this;
          }
          /**
           * Regime Geral de Previdência Social - RGPS
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev_1() {
            this.tpRegPrev = "1";
            return this;
          }
          /**
           * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev_2() {
            this.tpRegPrev = "2";
            return this;
          }
          /**
           * Regime de Previdência Social no exterior
           *
           * @return O próprio InfoDirigenteSindical para continuar populando outros campos
           */
          public InfoDirigenteSindical<T> setTpRegPrev_3() {
            this.tpRegPrev = "3";
            return this;
          }

          public InfoDirigenteSindical(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
        }

        /**
         * Informações relativas ao trabalhador cedido/em exercício em outro órgão
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "categOrig",
              "cnpjCednt",
              "matricCed",
              "dtAdmCed",
              "tpRegTrab",
              "tpRegPrev",
            })
        public static class InfoTrabCedido<T> {

          /** Preencher com o código correspondente à categoria de origem do trabalhador cedido. */
          private Integer categOrig;

          /** Informar o CNPJ do empregador/órgão público cedente/de origem. */
          private String cnpjCednt;

          /**
           * Preencher com a matrícula do trabalhador no empregador/órgão público cedente/de origem.
           */
          private String matricCed;

          /**
           * Preencher com a data de admissão (ou de exercício) do trabalhador no empregador/órgão
           * público cedente/de origem.
           */
          private javax.xml.datatype.XMLGregorianCalendar dtAdmCed;

          /** Tipo de regime trabalhista. */
          private String tpRegTrab;

          /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
          private String tpRegPrev;

          /**
           * Preencher com o código correspondente à categoria de origem do trabalhador cedido.
           *
           * @return Conteúdo do campo categOrig
           */
          public Integer getCategOrig() {
            return this.categOrig;
          }

          /**
           * Preencher com o código correspondente à categoria de origem do trabalhador cedido.
           *
           * <p>Validação: Deve ser um código válido e existente na Tabela 01, diferente de [410].
           *
           * @param categOrig Valor para atribuir ao campo categOrig
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setCategOrig(Integer categOrig) {
            this.categOrig = categOrig;
            return this;
          }

          /**
           * Informar o CNPJ do empregador/órgão público cedente/de origem.
           *
           * @return Conteúdo do campo cnpjCednt
           */
          public String getCnpjCednt() {
            return this.cnpjCednt;
          }

          /**
           * Informar o CNPJ do empregador/órgão público cedente/de origem.
           *
           * <p>Validação: Deve ser um CNPJ diferente do CNPJ do empregador/órgão público e
           * diferente dos estabelecimentos informados através do evento S-1005.
           *
           * <p>REGRA:REGRA_VALIDA_CNPJ
           *
           * @param cnpjCednt Valor para atribuir ao campo cnpjCednt
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setCnpjCednt(String cnpjCednt) {
            this.cnpjCednt = cnpjCednt;
            return this;
          }

          /**
           * Preencher com a matrícula do trabalhador no empregador/órgão público cedente/de origem.
           *
           * @return Conteúdo do campo matricCed
           */
          public String getMatricCed() {
            return this.matricCed;
          }

          /**
           * Preencher com a matrícula do trabalhador no empregador/órgão público cedente/de origem.
           *
           * @param matricCed Valor para atribuir ao campo matricCed
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setMatricCed(String matricCed) {
            this.matricCed = matricCed;
            return this;
          }

          /**
           * Preencher com a data de admissão (ou de exercício) do trabalhador no empregador/órgão
           * público cedente/de origem.
           *
           * @return Conteúdo do campo dtAdmCed
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtAdmCed() {
            return this.dtAdmCed;
          }

          /**
           * Preencher com a data de admissão (ou de exercício) do trabalhador no empregador/órgão
           * público cedente/de origem.
           *
           * <p>Validação: Deve ser uma data anterior a {dtInicio}(2300_infoTSVInicio_dtInicio) e
           * igual ou posterior a 01/01/1890.
           *
           * @param dtAdmCed Valor para atribuir ao campo dtAdmCed
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setDtAdmCed(javax.xml.datatype.XMLGregorianCalendar dtAdmCed) {
            this.dtAdmCed = dtAdmCed;
            return this;
          }

          /**
           * Tipo de regime trabalhista.
           *
           * @return Conteúdo do campo tpRegTrab
           */
          public String getTpRegTrab() {
            return this.tpRegTrab;
          }

          /**
           * Tipo de regime trabalhista.
           *
           * @param tpRegTrab Valor para atribuir ao campo tpRegTrab
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegTrab(String tpRegTrab) {
            if (!"1".equals(tpRegTrab) && !"2".equals(tpRegTrab))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegTrab) + " inválido para o campo tpRegTrab");
            this.tpRegTrab = tpRegTrab;
            return this;
          }
          /**
           * CLT - Consolidação das Leis de Trabalho e legislações trabalhistas específicas
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegTrab_1() {
            this.tpRegTrab = "1";
            return this;
          }
          /**
           * Estatutário/legislações específicas (servidor temporário, militar, agente político,
           * etc.)
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegTrab_2() {
            this.tpRegTrab = "2";
            return this;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @return Conteúdo do campo tpRegPrev
           */
          public String getTpRegPrev() {
            return this.tpRegPrev;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * <p>Validação: Se {infoTrabCedido/categOrig}(./categOrig) for relativa a "Empregado",
           * não pode ser preenchido com [2].
           *
           * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev(String tpRegPrev) {
            if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
            this.tpRegPrev = tpRegPrev;
            return this;
          }
          /**
           * Regime Geral de Previdência Social - RGPS
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev_1() {
            this.tpRegPrev = "1";
            return this;
          }
          /**
           * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev_2() {
            this.tpRegPrev = "2";
            return this;
          }
          /**
           * Regime de Previdência Social no exterior
           *
           * @return O próprio InfoTrabCedido para continuar populando outros campos
           */
          public InfoTrabCedido<T> setTpRegPrev_3() {
            this.tpRegPrev = "3";
            return this;
          }

          public InfoTrabCedido(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
        }

        /**
         * Informações relativas a servidor público exercente de mandato eletivo.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "indRemunCargo",
              "tpRegTrab",
              "tpRegPrev",
            })
        public static class InfoMandElet<T> {

          /** Indicar se o servidor optou pela remuneração do cargo efetivo. */
          private String indRemunCargo;

          /** Tipo de regime trabalhista. */
          private String tpRegTrab;

          /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
          private String tpRegPrev;

          /**
           * Indicar se o servidor optou pela remuneração do cargo efetivo.
           *
           * @return Conteúdo do campo indRemunCargo
           */
          public String getIndRemunCargo() {
            return this.indRemunCargo;
          }

          /**
           * Indicar se o servidor optou pela remuneração do cargo efetivo.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {CBOCargo}(../cargoFuncao_CBOCargo)
           * = [111120, 111250, 111255]).
           *
           * @param indRemunCargo Valor para atribuir ao campo indRemunCargo
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo(String indRemunCargo) {
            if (!"S".equals(indRemunCargo) && !"N".equals(indRemunCargo))
              throw new RuntimeException(
                  "Valor "
                      + String.valueOf(indRemunCargo)
                      + " inválido para o campo indRemunCargo");
            this.indRemunCargo = indRemunCargo;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo_S() {
            this.indRemunCargo = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo_N() {
            this.indRemunCargo = "N";
            return this;
          }

          /**
           * Tipo de regime trabalhista.
           *
           * @return Conteúdo do campo tpRegTrab
           */
          public String getTpRegTrab() {
            return this.tpRegTrab;
          }

          /**
           * Tipo de regime trabalhista.
           *
           * @param tpRegTrab Valor para atribuir ao campo tpRegTrab
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegTrab(String tpRegTrab) {
            if (!"1".equals(tpRegTrab) && !"2".equals(tpRegTrab))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegTrab) + " inválido para o campo tpRegTrab");
            this.tpRegTrab = tpRegTrab;
            return this;
          }
          /**
           * CLT - Consolidação das Leis de Trabalho e legislações trabalhistas específicas
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegTrab_1() {
            this.tpRegTrab = "1";
            return this;
          }
          /**
           * Estatutário/legislações específicas (servidor temporário, militar, agente político,
           * etc.)
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegTrab_2() {
            this.tpRegTrab = "2";
            return this;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @return Conteúdo do campo tpRegPrev
           */
          public String getTpRegPrev() {
            return this.tpRegPrev;
          }

          /**
           * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
           *
           * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev(String tpRegPrev) {
            if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
            this.tpRegPrev = tpRegPrev;
            return this;
          }
          /**
           * Regime Geral de Previdência Social - RGPS
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev_1() {
            this.tpRegPrev = "1";
            return this;
          }
          /**
           * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev_2() {
            this.tpRegPrev = "2";
            return this;
          }
          /**
           * Regime de Previdência Social no exterior
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setTpRegPrev_3() {
            this.tpRegPrev = "3";
            return this;
          }

          public InfoMandElet(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
        }
      }

      /**
       * Informações de mudança de CPF do trabalhador.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfAnt",
            "matricAnt",
            "dtAltCPF",
            "observacao",
          })
      public static class MudancaCPF<T> {

        /** Preencher com o número do CPF antigo do trabalhador. */
        private String cpfAnt;

        /** Preencher com a matrícula anterior do trabalhador. */
        private String matricAnt;

        /** Data de alteração do CPF. */
        private javax.xml.datatype.XMLGregorianCalendar dtAltCPF;

        /** Observação. */
        private String observacao;

        /**
         * Preencher com o número do CPF antigo do trabalhador.
         *
         * @return Conteúdo do campo cpfAnt
         */
        public String getCpfAnt() {
          return this.cpfAnt;
        }

        /**
         * Preencher com o número do CPF antigo do trabalhador.
         *
         * @param cpfAnt Valor para atribuir ao campo cpfAnt
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setCpfAnt(String cpfAnt) {
          this.cpfAnt = cpfAnt;
          return this;
        }

        /**
         * Preencher com a matrícula anterior do trabalhador.
         *
         * @return Conteúdo do campo matricAnt
         */
        public String getMatricAnt() {
          return this.matricAnt;
        }

        /**
         * Preencher com a matrícula anterior do trabalhador.
         *
         * @param matricAnt Valor para atribuir ao campo matricAnt
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setMatricAnt(String matricAnt) {
          this.matricAnt = matricAnt;
          return this;
        }

        /**
         * Data de alteração do CPF.
         *
         * @return Conteúdo do campo dtAltCPF
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtAltCPF() {
          return this.dtAltCPF;
        }

        /**
         * Data de alteração do CPF.
         *
         * @param dtAltCPF Valor para atribuir ao campo dtAltCPF
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setDtAltCPF(javax.xml.datatype.XMLGregorianCalendar dtAltCPF) {
          this.dtAltCPF = dtAltCPF;
          return this;
        }

        /**
         * Observação.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public MudancaCPF(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Informações de afastamento do TSVE
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtIniAfast",
            "codMotAfast",
          })
      public static class Afastamento<T> {

        /** Data de início do afastamento. */
        private javax.xml.datatype.XMLGregorianCalendar dtIniAfast;

        /** Preencher com o código do motivo de afastamento temporário. */
        private String codMotAfast;

        /**
         * Data de início do afastamento.
         *
         * @return Conteúdo do campo dtIniAfast
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtIniAfast() {
          return this.dtIniAfast;
        }

        /**
         * Data de início do afastamento.
         *
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de início do TSVE;
         *
         * <p>b) Se {cadIni}(2300_infoTSVInicio_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o empregador;
         *
         * <p>c) Se {cadIni}(2300_infoTSVInicio_cadIni) = [N], deve ser anterior à data de alteração
         * do CPF do trabalhador ({dtAltCPF}(2300_infoTSVInicio_mudancaCPF_dtAltCPF)).
         *
         * @param dtIniAfast Valor para atribuir ao campo dtIniAfast
         * @return O próprio Afastamento para continuar populando outros campos
         */
        public Afastamento<T> setDtIniAfast(javax.xml.datatype.XMLGregorianCalendar dtIniAfast) {
          this.dtIniAfast = dtIniAfast;
          return this;
        }

        /**
         * Preencher com o código do motivo de afastamento temporário.
         *
         * @return Conteúdo do campo codMotAfast
         */
        public String getCodMotAfast() {
          return this.codMotAfast;
        }

        /**
         * Preencher com o código do motivo de afastamento temporário.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 18.
         *
         * @param codMotAfast Valor para atribuir ao campo codMotAfast
         * @return O próprio Afastamento para continuar populando outros campos
         */
        public Afastamento<T> setCodMotAfast(String codMotAfast) {
          this.codMotAfast = codMotAfast;
          return this;
        }

        public Afastamento(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Informação do término do TSVE
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtTerm",
          })
      public static class Termino<T> {

        /** Preencher com a data do término. */
        private javax.xml.datatype.XMLGregorianCalendar dtTerm;

        /**
         * Preencher com a data do término.
         *
         * @return Conteúdo do campo dtTerm
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTerm() {
          return this.dtTerm;
        }

        /**
         * Preencher com a data do término.
         *
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de início do TSVE;
         *
         * <p>b) Deve ser anterior à data de início da obrigatoriedade dos eventos não periódicos
         * para o empregador.
         *
         * @param dtTerm Valor para atribuir ao campo dtTerm
         * @return O próprio Termino para continuar populando outros campos
         */
        public Termino<T> setDtTerm(javax.xml.datatype.XMLGregorianCalendar dtTerm) {
          this.dtTerm = dtTerm;
          return this;
        }

        public Termino(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }
    }
  }
}
