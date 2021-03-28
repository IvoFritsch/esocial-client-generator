package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2405 - Cadastro de Beneficiário - Entes Públicos - Alteração */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCdBenefAlt",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CdBenefAlt {

  /** Evento Cadastro de Beneficiário - Alteração */
  private EvtCdBenefAlt evtCdBenefAlt;

  /**
   * Evento Cadastro de Beneficiário - Alteração
   *
   * @return Conteúdo do campo evtCdBenefAlt
   */
  public EvtCdBenefAlt getEvtCdBenefAlt() {
    return this.evtCdBenefAlt;
  }

  /**
   * Evento Cadastro de Beneficiário - Alteração
   *
   * <p>DESCRICAO_COMPLETA:Evento Cadastro de Beneficiário - Entes Públicos - Alteração.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * @return O objeto EvtCdBenefAlt para população dos campos filhos
   */
  public EvtCdBenefAlt<Evento_CdBenefAlt> setEvtCdBenefAlt() {
    if (this.evtCdBenefAlt == null) {
      this.evtCdBenefAlt = new EvtCdBenefAlt(this);
    }
    return this.evtCdBenefAlt;
  }

  /**
   * Evento Cadastro de Beneficiário - Alteração
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideBenef",
        "alteracao",
      })
  public static class EvtCdBenefAlt<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Identificação do beneficiário. */
    private IdeBenef ideBenef;

    /** Alteração de dados do beneficiário. */
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
    public Tipos.T_ideEvento_trab<EvtCdBenefAlt<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador_cnpj para população dos campos filhos
     */
    public Tipos.T_ideEmpregador_cnpj<EvtCdBenefAlt<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador_cnpj(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do beneficiário.
     *
     * @return Conteúdo do campo ideBenef
     */
    public IdeBenef getIdeBenef() {
      return this.ideBenef;
    }

    /**
     * Identificação do beneficiário.
     *
     * <p>CHAVE_GRUPO: {cpfBenef}
     *
     * @return O objeto IdeBenef para população dos campos filhos
     */
    public IdeBenef<EvtCdBenefAlt<T>> setIdeBenef() {
      if (this.ideBenef == null) {
        this.ideBenef = new IdeBenef(this);
      }
      return this.ideBenef;
    }

    /**
     * Alteração de dados do beneficiário.
     *
     * @return Conteúdo do campo alteracao
     */
    public Alteracao getAlteracao() {
      return this.alteracao;
    }

    /**
     * Alteração de dados do beneficiário.
     *
     * <p>CHAVE_GRUPO: {dtAlteracao}
     *
     * @return O objeto Alteracao para população dos campos filhos
     */
    public Alteracao<EvtCdBenefAlt<T>> setAlteracao() {
      if (this.alteracao == null) {
        this.alteracao = new Alteracao(this);
      }
      return this.alteracao;
    }

    public EvtCdBenefAlt(Object pai) {
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
     * Identificação do beneficiário.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfBenef",
        })
    public static class IdeBenef<T> {

      /** Informar o CPF do beneficiário. */
      private String cpfBenef;

      /**
       * Informar o CPF do beneficiário.
       *
       * @return Conteúdo do campo cpfBenef
       */
      public String getCpfBenef() {
        return this.cpfBenef;
      }

      /**
       * Informar o CPF do beneficiário.
       *
       * <p>Validação: Deve ser um CPF válido e cadastrado pelo órgão público declarante por meio do
       * evento S-2400.
       *
       * @param cpfBenef Valor para atribuir ao campo cpfBenef
       * @return O próprio IdeBenef para continuar populando outros campos
       */
      public IdeBenef<T> setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
        return this;
      }

      public IdeBenef(Object pai) {
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
     * Alteração de dados do beneficiário.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtAlteracao",
          "dadosBenef",
        })
    public static class Alteracao<T> {

      /** Preencher com a data de alteração. */
      private javax.xml.datatype.XMLGregorianCalendar dtAlteracao;

      /** Dados do beneficiário. */
      private DadosBenef dadosBenef;

      /**
       * Preencher com a data de alteração.
       *
       * @return Conteúdo do campo dtAlteracao
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAlteracao() {
        return this.dtAlteracao;
      }

      /**
       * Preencher com a data de alteração.
       *
       * <p>Validação: Deve ser posterior à data de início informada no evento S-2400 e igual ou
       * anterior à data atual.
       *
       * @param dtAlteracao Valor para atribuir ao campo dtAlteracao
       * @return O próprio Alteracao para continuar populando outros campos
       */
      public Alteracao<T> setDtAlteracao(javax.xml.datatype.XMLGregorianCalendar dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
        return this;
      }

      /**
       * Dados do beneficiário.
       *
       * @return Conteúdo do campo dadosBenef
       */
      public DadosBenef getDadosBenef() {
        return this.dadosBenef;
      }

      /**
       * Dados do beneficiário.
       *
       * @return O objeto DadosBenef para população dos campos filhos
       */
      public DadosBenef<Alteracao<T>> setDadosBenef() {
        if (this.dadosBenef == null) {
          this.dadosBenef = new DadosBenef(this);
        }
        return this.dadosBenef;
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
       * Dados do beneficiário.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nmBenefic",
            "sexo",
            "racaCor",
            "estCiv",
            "incFisMen",
            "endereco",
            "dependente",
          })
      public static class DadosBenef<T> {

        /** Informar o nome do beneficiário. */
        private String nmBenefic;

        /** Sexo do beneficiário. */
        private String sexo;

        /** Raça e cor do beneficiário. */
        private String racaCor;

        /** Estado civil do beneficiário. */
        private String estCiv;

        /**
         * Informar se o beneficiário é pessoa com doença incapacitante que isenta da contribuição
         * previdenciária, total ou parcialmente, reconhecida administrativa ou judicialmente, na
         * forma da lei.
         */
        private String incFisMen;

        /** Endereço do beneficiário. */
        private Endereco endereco;

        /**
         * Informações dos dependentes.
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         */
        private java.util.List<Dependente> dependente;

        /**
         * Informar o nome do beneficiário.
         *
         * @return Conteúdo do campo nmBenefic
         */
        public String getNmBenefic() {
          return this.nmBenefic;
        }

        /**
         * Informar o nome do beneficiário.
         *
         * @param nmBenefic Valor para atribuir ao campo nmBenefic
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setNmBenefic(String nmBenefic) {
          this.nmBenefic = nmBenefic;
          return this;
        }

        /**
         * Sexo do beneficiário.
         *
         * @return Conteúdo do campo sexo
         */
        public String getSexo() {
          return this.sexo;
        }

        /**
         * Sexo do beneficiário.
         *
         * @param sexo Valor para atribuir ao campo sexo
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setSexo(String sexo) {
          if (!"M".equals(sexo) && !"F".equals(sexo))
            throw new RuntimeException(
                "Valor " + String.valueOf(sexo) + " inválido para o campo sexo");
          this.sexo = sexo;
          return this;
        }
        /**
         * Masculino
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setSexo_M() {
          this.sexo = "M";
          return this;
        }
        /**
         * Feminino
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setSexo_F() {
          this.sexo = "F";
          return this;
        }

        /**
         * Raça e cor do beneficiário.
         *
         * @return Conteúdo do campo racaCor
         */
        public String getRacaCor() {
          return this.racaCor;
        }

        /**
         * Raça e cor do beneficiário.
         *
         * @param racaCor Valor para atribuir ao campo racaCor
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor(String racaCor) {
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
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor_1() {
          this.racaCor = "1";
          return this;
        }
        /**
         * Preta
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor_2() {
          this.racaCor = "2";
          return this;
        }
        /**
         * Parda
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor_3() {
          this.racaCor = "3";
          return this;
        }
        /**
         * Amarela
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor_4() {
          this.racaCor = "4";
          return this;
        }
        /**
         * Indígena
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor_5() {
          this.racaCor = "5";
          return this;
        }
        /**
         * Não informado
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setRacaCor_6() {
          this.racaCor = "6";
          return this;
        }

        /**
         * Estado civil do beneficiário.
         *
         * @return Conteúdo do campo estCiv
         */
        public String getEstCiv() {
          return this.estCiv;
        }

        /**
         * Estado civil do beneficiário.
         *
         * @param estCiv Valor para atribuir ao campo estCiv
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setEstCiv(String estCiv) {
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
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setEstCiv_1() {
          this.estCiv = "1";
          return this;
        }
        /**
         * Casado
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setEstCiv_2() {
          this.estCiv = "2";
          return this;
        }
        /**
         * Divorciado
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setEstCiv_3() {
          this.estCiv = "3";
          return this;
        }
        /**
         * Separado
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setEstCiv_4() {
          this.estCiv = "4";
          return this;
        }
        /**
         * Viúvo
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setEstCiv_5() {
          this.estCiv = "5";
          return this;
        }

        /**
         * Informar se o beneficiário é pessoa com doença incapacitante que isenta da contribuição
         * previdenciária, total ou parcialmente, reconhecida administrativa ou judicialmente, na
         * forma da lei.
         *
         * @return Conteúdo do campo incFisMen
         */
        public String getIncFisMen() {
          return this.incFisMen;
        }

        /**
         * Informar se o beneficiário é pessoa com doença incapacitante que isenta da contribuição
         * previdenciária, total ou parcialmente, reconhecida administrativa ou judicialmente, na
         * forma da lei.
         *
         * @param incFisMen Valor para atribuir ao campo incFisMen
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setIncFisMen(String incFisMen) {
          if (!"S".equals(incFisMen) && !"N".equals(incFisMen))
            throw new RuntimeException(
                "Valor " + String.valueOf(incFisMen) + " inválido para o campo incFisMen");
          this.incFisMen = incFisMen;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setIncFisMen_S() {
          this.incFisMen = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio DadosBenef para continuar populando outros campos
         */
        public DadosBenef<T> setIncFisMen_N() {
          this.incFisMen = "N";
          return this;
        }

        /**
         * Endereço do beneficiário.
         *
         * @return Conteúdo do campo endereco
         */
        public Endereco getEndereco() {
          return this.endereco;
        }

        /**
         * Endereço do beneficiário.
         *
         * <p>DESCRICAO_COMPLETA:Grupo de informações do endereço do beneficiário.
         *
         * @return O objeto Endereco para população dos campos filhos
         */
        public Endereco<DadosBenef<T>> setEndereco() {
          if (this.endereco == null) {
            this.endereco = new Endereco(this);
          }
          return this.endereco;
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
        public Dependente<DadosBenef<T>> setDependente_Next() {
          if (this.dependente == null) {
            this.dependente = new java.util.ArrayList<>();
          }
          Dependente toAdd = new Dependente(this);
          this.dependente.add(toAdd);
          return toAdd;
        }

        public DadosBenef(Object pai) {
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
         * Endereço do beneficiário.
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
              "incFisMen",
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
           * Informar se é dependente do beneficiário para fins de dedução de seu rendimento
           * tributável pelo Imposto de Renda.
           */
          private String depIRRF;

          /** Informar se o dependente é pessoa com doença incapacitante, na forma da lei. */
          private String incFisMen;

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
           * <p>b) Não pode haver mais de um dependente com o mesmo número de CPF.
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
           * Informar se é dependente do beneficiário para fins de dedução de seu rendimento
           * tributável pelo Imposto de Renda.
           *
           * @return Conteúdo do campo depIRRF
           */
          public String getDepIRRF() {
            return this.depIRRF;
          }

          /**
           * Informar se é dependente do beneficiário para fins de dedução de seu rendimento
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
           * Informar se o dependente é pessoa com doença incapacitante, na forma da lei.
           *
           * @return Conteúdo do campo incFisMen
           */
          public String getIncFisMen() {
            return this.incFisMen;
          }

          /**
           * Informar se o dependente é pessoa com doença incapacitante, na forma da lei.
           *
           * @param incFisMen Valor para atribuir ao campo incFisMen
           * @return O próprio Dependente para continuar populando outros campos
           */
          public Dependente<T> setIncFisMen(String incFisMen) {
            if (!"S".equals(incFisMen) && !"N".equals(incFisMen))
              throw new RuntimeException(
                  "Valor " + String.valueOf(incFisMen) + " inválido para o campo incFisMen");
            this.incFisMen = incFisMen;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio Dependente para continuar populando outros campos
           */
          public Dependente<T> setIncFisMen_S() {
            this.incFisMen = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio Dependente para continuar populando outros campos
           */
          public Dependente<T> setIncFisMen_N() {
            this.incFisMen = "N";
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
