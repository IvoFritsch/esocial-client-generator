package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2400 - Cadastro de Beneficiário - Entes Públicos - Início */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCdBenefIn",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CdBenefIn {

  /** Evento Cadastro de Beneficiário - Início */
  private EvtCdBenefIn evtCdBenefIn;

  /**
   * Evento Cadastro de Beneficiário - Início
   *
   * @return Conteúdo do campo evtCdBenefIn
   */
  public EvtCdBenefIn getEvtCdBenefIn() {
    return this.evtCdBenefIn;
  }

  /**
   * Evento Cadastro de Beneficiário - Início
   *
   * <p>DESCRICAO_COMPLETA:Evento Cadastro de Beneficiário - Entes Públicos - Início.
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
   * <p>REGRA:REGRA_VALIDA_CNPJ
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * @return O objeto EvtCdBenefIn para população dos campos filhos
   */
  public EvtCdBenefIn<Evento_CdBenefIn> setEvtCdBenefIn() {
    if (this.evtCdBenefIn == null) {
      this.evtCdBenefIn = new EvtCdBenefIn(this);
    }
    return this.evtCdBenefIn;
  }

  /**
   * Evento Cadastro de Beneficiário - Início
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "beneficiario",
      })
  public static class EvtCdBenefIn<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private IdeEmpregador ideEmpregador;

    /** Grupo de informações do beneficiário. */
    private Beneficiario beneficiario;

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
    public Tipos.T_ideEvento_trab<EvtCdBenefIn<T>> setIdeEvento() {
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
    public IdeEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto IdeEmpregador para população dos campos filhos
     */
    public IdeEmpregador<EvtCdBenefIn<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new IdeEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Grupo de informações do beneficiário.
     *
     * @return Conteúdo do campo beneficiario
     */
    public Beneficiario getBeneficiario() {
      return this.beneficiario;
    }

    /**
     * Grupo de informações do beneficiário.
     *
     * <p>CHAVE_GRUPO: {cpfBenef}
     *
     * @return O objeto Beneficiario para população dos campos filhos
     */
    public Beneficiario<EvtCdBenefIn<T>> setBeneficiario() {
      if (this.beneficiario == null) {
        this.beneficiario = new Beneficiario(this);
      }
      return this.beneficiario;
    }

    public EvtCdBenefIn(Object pai) {
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
     * Informações de identificação do empregador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpInsc", "nrInsc",
        })
    public static class IdeEmpregador<T> {

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
       */
      private String nrInsc;

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
       * @param tpInsc Valor para atribuir ao campo tpInsc
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc(String tpInsc) {
        if (!"1".equals(tpInsc))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
        this.tpInsc = tpInsc;
        return this;
      }
      /**
       * CNPJ
       *
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc_1() {
        this.tpInsc = "1";
        return this;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
       *
       * @return Conteúdo do campo nrInsc
       */
      public String getNrInsc() {
        return this.nrInsc;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
       *
       * <p>Validação: A natureza jurídica relativa ao número de inscrição informado deve ser
       * Administração Pública (grupo [1]).
       *
       * @param nrInsc Valor para atribuir ao campo nrInsc
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
        return this;
      }

      public IdeEmpregador(Object pai) {
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
     * Grupo de informações do beneficiário.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfBenef",
          "nmBenefic",
          "dtNascto",
          "dtInicio",
          "sexo",
          "racaCor",
          "estCiv",
          "incFisMen",
          "dtIncFisMen",
          "endereco",
          "dependente",
        })
    public static class Beneficiario<T> {

      /** Informar o CPF do beneficiário. */
      private String cpfBenef;

      /** Informar o nome do beneficiário. */
      private String nmBenefic;

      /** Preencher com a data de nascimento. */
      private javax.xml.datatype.XMLGregorianCalendar dtNascto;

      /**
       * Preencher com a data de início do cadastro do beneficiário. Informar a data de início da
       * obrigatoriedade dos eventos não periódicos para o ente público no eSocial caso o
       * beneficiário possua cadastro anterior a essa data.
       */
      private javax.xml.datatype.XMLGregorianCalendar dtInicio;

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

      /** Preencher com a data do reconhecimento da incapacidade. */
      private javax.xml.datatype.XMLGregorianCalendar dtIncFisMen;

      /** Endereço do beneficiário. */
      private Endereco endereco;

      /**
       * Informações dos dependentes.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<Dependente> dependente;

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
       * <p>Validação: Não é possível existir dois eventos originais do mesmo órgão público
       * declarante para o mesmo CPF do beneficiário.
       *
       * @param cpfBenef Valor para atribuir ao campo cpfBenef
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
        return this;
      }

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
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setNmBenefic(String nmBenefic) {
        this.nmBenefic = nmBenefic;
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
       * @param dtNascto Valor para atribuir ao campo dtNascto
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
        this.dtNascto = dtNascto;
        return this;
      }

      /**
       * Preencher com a data de início do cadastro do beneficiário. Informar a data de início da
       * obrigatoriedade dos eventos não periódicos para o ente público no eSocial caso o
       * beneficiário possua cadastro anterior a essa data.
       *
       * @return Conteúdo do campo dtInicio
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtInicio() {
        return this.dtInicio;
      }

      /**
       * Preencher com a data de início do cadastro do beneficiário. Informar a data de início da
       * obrigatoriedade dos eventos não periódicos para o ente público no eSocial caso o
       * beneficiário possua cadastro anterior a essa data.
       *
       * <p>Validação: Deve ser igual ou posterior à data de início da obrigatoriedade dos eventos
       * não periódicos para o ente público no eSocial e igual ou anterior à data atual.
       *
       * @param dtInicio Valor para atribuir ao campo dtInicio
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setDtInicio(javax.xml.datatype.XMLGregorianCalendar dtInicio) {
        this.dtInicio = dtInicio;
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
       * <p>Validação: Informação obrigatória se {dtInicio}(./dtInicio) for posterior ao início da
       * obrigatoriedade dos eventos não periódicos para o ente público no eSocial.
       *
       * @param sexo Valor para atribuir ao campo sexo
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setSexo(String sexo) {
        if (!"M".equals(sexo) && !"F".equals(sexo))
          throw new RuntimeException(
              "Valor " + String.valueOf(sexo) + " inválido para o campo sexo");
        this.sexo = sexo;
        return this;
      }
      /**
       * Masculino
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setSexo_M() {
        this.sexo = "M";
        return this;
      }
      /**
       * Feminino
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setSexo_F() {
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
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor(String racaCor) {
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
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor_1() {
        this.racaCor = "1";
        return this;
      }
      /**
       * Preta
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor_2() {
        this.racaCor = "2";
        return this;
      }
      /**
       * Parda
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor_3() {
        this.racaCor = "3";
        return this;
      }
      /**
       * Amarela
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor_4() {
        this.racaCor = "4";
        return this;
      }
      /**
       * Indígena
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor_5() {
        this.racaCor = "5";
        return this;
      }
      /**
       * Não informado
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setRacaCor_6() {
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
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setEstCiv(String estCiv) {
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
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setEstCiv_1() {
        this.estCiv = "1";
        return this;
      }
      /**
       * Casado
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setEstCiv_2() {
        this.estCiv = "2";
        return this;
      }
      /**
       * Divorciado
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setEstCiv_3() {
        this.estCiv = "3";
        return this;
      }
      /**
       * Separado
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setEstCiv_4() {
        this.estCiv = "4";
        return this;
      }
      /**
       * Viúvo
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setEstCiv_5() {
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
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setIncFisMen(String incFisMen) {
        if (!"S".equals(incFisMen) && !"N".equals(incFisMen))
          throw new RuntimeException(
              "Valor " + String.valueOf(incFisMen) + " inválido para o campo incFisMen");
        this.incFisMen = incFisMen;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setIncFisMen_S() {
        this.incFisMen = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setIncFisMen_N() {
        this.incFisMen = "N";
        return this;
      }

      /**
       * Preencher com a data do reconhecimento da incapacidade.
       *
       * @return Conteúdo do campo dtIncFisMen
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtIncFisMen() {
        return this.dtIncFisMen;
      }

      /**
       * Preencher com a data do reconhecimento da incapacidade.
       *
       * <p>Validação: Informação obrigatória e exclusiva se {incFisMen}(./incFisMen) = [S].
       *
       * @param dtIncFisMen Valor para atribuir ao campo dtIncFisMen
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setDtIncFisMen(javax.xml.datatype.XMLGregorianCalendar dtIncFisMen) {
        this.dtIncFisMen = dtIncFisMen;
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
      public Endereco<Beneficiario<T>> setEndereco() {
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
      public Dependente<Beneficiario<T>> setDependente_Next() {
        if (this.dependente == null) {
          this.dependente = new java.util.ArrayList<>();
        }
        Dependente toAdd = new Dependente(this);
        this.dependente.add(toAdd);
        return toAdd;
      }

      public Beneficiario(Object pai) {
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
         * <p>Validação: Informação obrigatória se {dtInicio}(../dtInicio) for posterior ao início
         * da obrigatoriedade dos eventos não periódicos para o ente público no eSocial.
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
