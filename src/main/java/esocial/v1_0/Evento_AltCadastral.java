package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2205 - Alteração de Dados Cadastrais do Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtAltCadastral",
    })
@XmlRootElement(name = "eSocial")
public class Evento_AltCadastral {

  /** Evento Alteração de Dados Cadastrais do Trabalhador. */
  private EvtAltCadastral evtAltCadastral;

  /**
   * Evento Alteração de Dados Cadastrais do Trabalhador.
   *
   * @return Conteúdo do campo evtAltCadastral
   */
  public EvtAltCadastral getEvtAltCadastral() {
    return this.evtAltCadastral;
  }

  /**
   * Evento Alteração de Dados Cadastrais do Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXISTE_TRABALHADOR
   *
   * <p>REGRA:REGRA_EXTEMP_DOMESTICO
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * @return O objeto EvtAltCadastral para população dos campos filhos
   */
  public EvtAltCadastral<Evento_AltCadastral> setEvtAltCadastral() {
    if (this.evtAltCadastral == null) {
      this.evtAltCadastral = new EvtAltCadastral(this);
    }
    return this.evtAltCadastral;
  }

  /**
   * Evento Alteração de Dados Cadastrais do Trabalhador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideTrabalhador",
        "alteracao",
      })
  public static class EvtAltCadastral<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do trabalhador. */
    private IdeTrabalhador ideTrabalhador;

    /** Alteração de dados cadastrais do trabalhador. */
    private Alteracao alteracao;

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
    public Tipos.T_ideEvento_trab<EvtAltCadastral<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtAltCadastral<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do trabalhador.
     *
     * @return Conteúdo do campo ideTrabalhador
     */
    public IdeTrabalhador getIdeTrabalhador() {
      return this.ideTrabalhador;
    }

    /**
     * Identificação do trabalhador.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}
     *
     * @return O objeto IdeTrabalhador para população dos campos filhos
     */
    public IdeTrabalhador<EvtAltCadastral<T>> setIdeTrabalhador() {
      if (this.ideTrabalhador == null) {
        this.ideTrabalhador = new IdeTrabalhador(this);
      }
      return this.ideTrabalhador;
    }

    /**
     * Alteração de dados cadastrais do trabalhador.
     *
     * @return Conteúdo do campo alteracao
     */
    public Alteracao getAlteracao() {
      return this.alteracao;
    }

    /**
     * Alteração de dados cadastrais do trabalhador.
     *
     * <p>CHAVE_GRUPO: {dtAlteracao}
     *
     * @return O objeto Alteracao para população dos campos filhos
     */
    public Alteracao<EvtAltCadastral<T>> setAlteracao() {
      if (this.alteracao == null) {
        this.alteracao = new Alteracao(this);
      }
      return this.alteracao;
    }

    public EvtAltCadastral(Object pai) {
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
     * Identificação do trabalhador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfTrab",
        })
    public static class IdeTrabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

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
       * @return O próprio IdeTrabalhador para continuar populando outros campos
       */
      public IdeTrabalhador<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      public IdeTrabalhador(Object pai) {
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
     * Alteração de dados cadastrais do trabalhador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtAlteracao",
          "dadosTrabalhador",
        })
    public static class Alteracao<T> {

      /** Preencher com a data da alteração das informações. */
      private javax.xml.datatype.XMLGregorianCalendar dtAlteracao;

      /** Informações pessoais do trabalhador. */
      private DadosTrabalhador dadosTrabalhador;

      /**
       * Preencher com a data da alteração das informações.
       *
       * @return Conteúdo do campo dtAlteracao
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAlteracao() {
        return this.dtAlteracao;
      }

      /**
       * Preencher com a data da alteração das informações.
       *
       * <p>Validação: Não pode ser posterior a 180 (cento e oitenta) dias da data atual.
       *
       * @param dtAlteracao Valor para atribuir ao campo dtAlteracao
       * @return O próprio Alteracao para continuar populando outros campos
       */
      public Alteracao<T> setDtAlteracao(javax.xml.datatype.XMLGregorianCalendar dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
        return this;
      }

      /**
       * Informações pessoais do trabalhador.
       *
       * @return Conteúdo do campo dadosTrabalhador
       */
      public DadosTrabalhador getDadosTrabalhador() {
        return this.dadosTrabalhador;
      }

      /**
       * Informações pessoais do trabalhador.
       *
       * @return O objeto DadosTrabalhador para população dos campos filhos
       */
      public DadosTrabalhador<Alteracao<T>> setDadosTrabalhador() {
        if (this.dadosTrabalhador == null) {
          this.dadosTrabalhador = new DadosTrabalhador(this);
        }
        return this.dadosTrabalhador;
      }

      public Alteracao(Object pai) {
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
       * Informações pessoais do trabalhador.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nmTrab",
            "sexo",
            "racaCor",
            "estCiv",
            "grauInstr",
            "nmSoc",
            "paisNac",
            "endereco",
            "trabImig",
            "infoDeficiencia",
            "dependente",
            "contato",
          })
      public static class DadosTrabalhador<T> {

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

        /** Preencher com o código do país de nacionalidade do trabalhador. */
        private String paisNac;

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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setNmTrab(String nmTrab) {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setSexo(String sexo) {
          if (!"M".equals(sexo) && !"F".equals(sexo))
            throw new RuntimeException(
                "Valor " + String.valueOf(sexo) + " inválido para o campo sexo");
          this.sexo = sexo;
          return this;
        }
        /**
         * Masculino
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setSexo_M() {
          this.sexo = "M";
          return this;
        }
        /**
         * Feminino
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setSexo_F() {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor(String racaCor) {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor_1() {
          this.racaCor = "1";
          return this;
        }
        /**
         * Preta
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor_2() {
          this.racaCor = "2";
          return this;
        }
        /**
         * Parda
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor_3() {
          this.racaCor = "3";
          return this;
        }
        /**
         * Amarela
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor_4() {
          this.racaCor = "4";
          return this;
        }
        /**
         * Indígena
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor_5() {
          this.racaCor = "5";
          return this;
        }
        /**
         * Não informado
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setRacaCor_6() {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setEstCiv(String estCiv) {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setEstCiv_1() {
          this.estCiv = "1";
          return this;
        }
        /**
         * Casado
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setEstCiv_2() {
          this.estCiv = "2";
          return this;
        }
        /**
         * Divorciado
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setEstCiv_3() {
          this.estCiv = "3";
          return this;
        }
        /**
         * Separado
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setEstCiv_4() {
          this.estCiv = "4";
          return this;
        }
        /**
         * Viúvo
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setEstCiv_5() {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr(String grauInstr) {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_01() {
          this.grauInstr = "01";
          return this;
        }
        /**
         * Até o 5º ano incompleto do ensino fundamental (antiga 4ª série) ou que se tenha
         * alfabetizado sem ter frequentado escola regular
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_02() {
          this.grauInstr = "02";
          return this;
        }
        /**
         * 5º ano completo do ensino fundamental
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_03() {
          this.grauInstr = "03";
          return this;
        }
        /**
         * Do 6º ao 9º ano do ensino fundamental incompleto (antiga 5ª a 8ª série)
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_04() {
          this.grauInstr = "04";
          return this;
        }
        /**
         * Ensino fundamental completo
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_05() {
          this.grauInstr = "05";
          return this;
        }
        /**
         * Ensino médio incompleto
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_06() {
          this.grauInstr = "06";
          return this;
        }
        /**
         * Ensino médio completo
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_07() {
          this.grauInstr = "07";
          return this;
        }
        /**
         * Educação superior incompleta
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_08() {
          this.grauInstr = "08";
          return this;
        }
        /**
         * Educação superior completa
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_09() {
          this.grauInstr = "09";
          return this;
        }
        /**
         * Pós-graduação completa
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_10() {
          this.grauInstr = "10";
          return this;
        }
        /**
         * Mestrado completo
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_11() {
          this.grauInstr = "11";
          return this;
        }
        /**
         * Doutorado completo
         *
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setGrauInstr_12() {
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
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setNmSoc(String nmSoc) {
          this.nmSoc = nmSoc;
          return this;
        }

        /**
         * Preencher com o código do país de nacionalidade do trabalhador.
         *
         * @return Conteúdo do campo paisNac
         */
        public String getPaisNac() {
          return this.paisNac;
        }

        /**
         * Preencher com o código do país de nacionalidade do trabalhador.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 06.
         *
         * @param paisNac Valor para atribuir ao campo paisNac
         * @return O próprio DadosTrabalhador para continuar populando outros campos
         */
        public DadosTrabalhador<T> setPaisNac(String paisNac) {
          this.paisNac = paisNac;
          return this;
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
        public Endereco<DadosTrabalhador<T>> setEndereco() {
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
         * <p>CONDICAO_GRUPO: OC (se {paisNac}(2205_alteracao_dadosTrabalhador_paisNac) for
         * diferente de [105]); N (nos demais casos)
         *
         * @return O objeto TrabImig para população dos campos filhos
         */
        public TrabImig<DadosTrabalhador<T>> setTrabImig() {
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
        public InfoDeficiencia<DadosTrabalhador<T>> setInfoDeficiencia() {
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
        public Dependente<DadosTrabalhador<T>> setDependente_Next() {
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
        public Tipos.T_contato<DadosTrabalhador<T>> setContato() {
          if (this.contato == null) {
            this.contato = new Tipos.T_contato(this);
          }
          return this.contato;
        }

        public DadosTrabalhador(Object pai) {
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
           * <p>CONDICAO_GRUPO: O (se não informado o grupo {brasil}(../brasil)); N (nos demais
           * casos)
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
           * <p>Validação: Preenchimento obrigatório quando houver trabalhador com
           * ({dtAdm}(2200_vinculo_infoRegimeTrab_infoCeletista_dtAdm) ou
           * {dtExercicio}(2200_vinculo_infoRegimeTrab_infoEstatutario_dtExercicio) ou
           * {dtInicio}(2300_infoTSVInicio_dtInicio)) no Registro de Eventos Trabalhistas - RET >=
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
              "infoCota",
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

          /**
           * Informar se o trabalhador preenche cota de pessoas com deficiência habilitadas ou de
           * beneficiários reabilitados.
           */
          private String infoCota;

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
           * Informar se o trabalhador preenche cota de pessoas com deficiência habilitadas ou de
           * beneficiários reabilitados.
           *
           * @return Conteúdo do campo infoCota
           */
          public String getInfoCota() {
            return this.infoCota;
          }

          /**
           * Informar se o trabalhador preenche cota de pessoas com deficiência habilitadas ou de
           * beneficiários reabilitados.
           *
           * <p>Validação: Preenchimento obrigatório e exclusivo quando houver trabalhador
           * cadastrado no evento S-2200 com {tpRegTrab}(2200_vinculo_tpRegTrab) = [1] e ativo em
           * {dtAlteracao}(2205_alteracao_dtAlteracao).
           *
           * @param infoCota Valor para atribuir ao campo infoCota
           * @return O próprio InfoDeficiencia para continuar populando outros campos
           */
          public InfoDeficiencia<T> setInfoCota(String infoCota) {
            if (!"S".equals(infoCota) && !"N".equals(infoCota))
              throw new RuntimeException(
                  "Valor " + String.valueOf(infoCota) + " inválido para o campo infoCota");
            this.infoCota = infoCota;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio InfoDeficiencia para continuar populando outros campos
           */
          public InfoDeficiencia<T> setInfoCota_S() {
            this.infoCota = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio InfoDeficiencia para continuar populando outros campos
           */
          public InfoDeficiencia<T> setInfoCota_N() {
            this.infoCota = "N";
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
              "sexoDep",
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

          /** Sexo do dependente. */
          private String sexoDep;

          /**
           * Informar se é dependente do trabalhador para fins de dedução de seu rendimento
           * tributável pelo Imposto de Renda.
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
           * Sexo do dependente.
           *
           * @return Conteúdo do campo sexoDep
           */
          public String getSexoDep() {
            return this.sexoDep;
          }

          /**
           * Sexo do dependente.
           *
           * <p>Validação: Preenchimento obrigatório e exclusivo quando houver trabalhador
           * cadastrado no evento S-2200, ativo em {dtAlteracao}(2205_alteracao_dtAlteracao) e com
           * {tpRegPrev} = [2] no RET.
           *
           * @param sexoDep Valor para atribuir ao campo sexoDep
           * @return O próprio Dependente para continuar populando outros campos
           */
          public Dependente<T> setSexoDep(String sexoDep) {
            if (!"M".equals(sexoDep) && !"F".equals(sexoDep))
              throw new RuntimeException(
                  "Valor " + String.valueOf(sexoDep) + " inválido para o campo sexoDep");
            this.sexoDep = sexoDep;
            return this;
          }
          /**
           * Masculino
           *
           * @return O próprio Dependente para continuar populando outros campos
           */
          public Dependente<T> setSexoDep_M() {
            this.sexoDep = "M";
            return this;
          }
          /**
           * Feminino
           *
           * @return O próprio Dependente para continuar populando outros campos
           */
          public Dependente<T> setSexoDep_F() {
            this.sexoDep = "F";
            return this;
          }

          /**
           * Informar se é dependente do trabalhador para fins de dedução de seu rendimento
           * tributável pelo Imposto de Renda.
           *
           * @return Conteúdo do campo depIRRF
           */
          public String getDepIRRF() {
            return this.depIRRF;
          }

          /**
           * Informar se é dependente do trabalhador para fins de dedução de seu rendimento
           * tributável pelo Imposto de Renda.
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
    }
  }
}
