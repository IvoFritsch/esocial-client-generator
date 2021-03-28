package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1207 - Benefícios - Entes Públicos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtBenPrRP",
    })
@XmlRootElement(name = "eSocial")
public class Evento_BenPrRP {

  /** Evento Benefícios - Entes Públicos. */
  private EvtBenPrRP evtBenPrRP;

  /**
   * Evento Benefícios - Entes Públicos.
   *
   * @return Conteúdo do campo evtBenPrRP
   */
  public EvtBenPrRP getEvtBenPrRP() {
    return this.evtBenPrRP;
  }

  /**
   * Evento Benefícios - Entes Públicos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_CONTROLE_DUPLICIDADE
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_REMUN_ANUAL_DEZEMBRO
   *
   * <p>REGRA:REGRA_REMUN_BENEFICIO_EXISTENTE_RET
   *
   * <p>REGRA:REGRA_REMUN_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_REMUN_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_RUBRICA_COMPATIVEL_DECTERCEIRO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_PERIODO_APURACAO
   *
   * @return O objeto EvtBenPrRP para população dos campos filhos
   */
  public EvtBenPrRP<Evento_BenPrRP> setEvtBenPrRP() {
    if (this.evtBenPrRP == null) {
      this.evtBenPrRP = new EvtBenPrRP(this);
    }
    return this.evtBenPrRP;
  }

  /**
   * Evento Benefícios - Entes Públicos.
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
        "dmDev",
      })
  public static class EvtBenPrRP<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_opp ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Identificação do beneficiário. */
    private IdeBenef ideBenef;

    /**
     * Demonstrativo de valores devidos ao beneficiário
     *
     * <p>- Esse campo pode ser repetido até 999 vezes
     */
    private java.util.List<DmDev> dmDev;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha_opp getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {indApuracao}, {perApur}
     *
     * @return O objeto Tipos.T_ideEvento_folha_opp para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha_opp<EvtBenPrRP<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha_opp(this);
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
    public Tipos.T_ideEmpregador_cnpj<EvtBenPrRP<T>> setIdeEmpregador() {
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
    public IdeBenef<EvtBenPrRP<T>> setIdeBenef() {
      if (this.ideBenef == null) {
        this.ideBenef = new IdeBenef(this);
      }
      return this.ideBenef;
    }

    /**
     * Demonstrativo de valores devidos ao beneficiário
     *
     * @return Conteúdo do campo dmDev
     */
    public java.util.List<DmDev> getDmDev() {
      return this.dmDev;
    }

    /**
     * Demonstrativo de valores devidos ao beneficiário
     *
     * <p>- Esse campo pode ser repetido até 999 vezes
     *
     * <p>DESCRICAO_COMPLETA:Identificação de cada um dos demonstrativos de valores devidos ao
     * beneficiário.
     *
     * <p>CHAVE_GRUPO: {ideDmDev}
     *
     * <p>REGRA:REGRA_DEMONSTRATIVO
     *
     * @return O objeto DmDev para população dos campos filhos
     */
    public DmDev<EvtBenPrRP<T>> setDmDev_Next() {
      if (this.dmDev == null) {
        this.dmDev = new java.util.ArrayList<>();
      }
      DmDev toAdd = new DmDev(this);
      this.dmDev.add(toAdd);
      return toAdd;
    }

    public EvtBenPrRP(Object pai) {
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
       * <p>Validação: Deve ser um CPF válido.
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
     * Demonstrativo de valores devidos ao beneficiário
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "ideDmDev",
          "nrBeneficio",
          "infoPerApur",
          "infoPerAnt",
        })
    public static class DmDev<T> {

      /**
       * Identificador atribuído pelo órgão público para o demonstrativo de valores devidos ao
       * beneficiário. O ente público pode preencher este campo utilizando-se de um identificador
       * padrão para todos os beneficiários; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       */
      private String ideDmDev;

      /** Preencher com o número do benefício. */
      private String nrBeneficio;

      /** Informações relativas ao período de apuração. */
      private InfoPerApur infoPerApur;

      /** Informações relativas a períodos anteriores */
      private InfoPerAnt infoPerAnt;

      /**
       * Identificador atribuído pelo órgão público para o demonstrativo de valores devidos ao
       * beneficiário. O ente público pode preencher este campo utilizando-se de um identificador
       * padrão para todos os beneficiários; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       *
       * @return Conteúdo do campo ideDmDev
       */
      public String getIdeDmDev() {
        return this.ideDmDev;
      }

      /**
       * Identificador atribuído pelo órgão público para o demonstrativo de valores devidos ao
       * beneficiário. O ente público pode preencher este campo utilizando-se de um identificador
       * padrão para todos os beneficiários; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       *
       * <p>Validação: Deve ser um identificador único dentro do mesmo
       * {perApur}(1207_ideEvento_perApur) para cada um dos demonstrativos do beneficiário.
       *
       * <p>REGRA:REGRA_CARACTERE_ESPECIAL
       *
       * @param ideDmDev Valor para atribuir ao campo ideDmDev
       * @return O próprio DmDev para continuar populando outros campos
       */
      public DmDev<T> setIdeDmDev(String ideDmDev) {
        this.ideDmDev = ideDmDev;
        return this;
      }

      /**
       * Preencher com o número do benefício.
       *
       * @return Conteúdo do campo nrBeneficio
       */
      public String getNrBeneficio() {
        return this.nrBeneficio;
      }

      /**
       * Preencher com o número do benefício.
       *
       * @param nrBeneficio Valor para atribuir ao campo nrBeneficio
       * @return O próprio DmDev para continuar populando outros campos
       */
      public DmDev<T> setNrBeneficio(String nrBeneficio) {
        this.nrBeneficio = nrBeneficio;
        return this;
      }

      /**
       * Informações relativas ao período de apuração.
       *
       * @return Conteúdo do campo infoPerApur
       */
      public InfoPerApur getInfoPerApur() {
        return this.infoPerApur;
      }

      /**
       * Informações relativas ao período de apuração.
       *
       * <p>CONDICAO_GRUPO: O (se não existir o grupo {infoPerAnt}(1207_dmDev_infoPerAnt)); OC (nos
       * demais casos)
       *
       * @return O objeto InfoPerApur para população dos campos filhos
       */
      public InfoPerApur<DmDev<T>> setInfoPerApur() {
        if (this.infoPerApur == null) {
          this.infoPerApur = new InfoPerApur(this);
        }
        return this.infoPerApur;
      }

      /**
       * Informações relativas a períodos anteriores
       *
       * @return Conteúdo do campo infoPerAnt
       */
      public InfoPerAnt getInfoPerAnt() {
        return this.infoPerAnt;
      }

      /**
       * Informações relativas a períodos anteriores
       *
       * <p>DESCRICAO_COMPLETA:Grupo destinado às informações relativas a períodos anteriores.
       * Somente preencher esse grupo se houver proventos ou pensões retroativos.
       *
       * <p>CONDICAO_GRUPO: O (se não existir o grupo {infoPerApur}(1207_dmDev_infoPerApur)); OC
       * (nos demais casos)
       *
       * @return O objeto InfoPerAnt para população dos campos filhos
       */
      public InfoPerAnt<DmDev<T>> setInfoPerAnt() {
        if (this.infoPerAnt == null) {
          this.infoPerAnt = new InfoPerAnt(this);
        }
        return this.infoPerAnt;
      }

      public DmDev(Object pai) {
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
       * Informações relativas ao período de apuração.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "ideEstab",
          })
      public static class InfoPerApur<T> {

        /**
         * Identificação da unidade do órgão público
         *
         * <p>- Esse campo pode ser repetido até 500 vezes
         */
        private java.util.List<T_ideEstab> ideEstab;

        /**
         * Identificação da unidade do órgão público
         *
         * @return Conteúdo do campo ideEstab
         */
        public java.util.List<T_ideEstab> getIdeEstab() {
          return this.ideEstab;
        }

        /**
         * Identificação da unidade do órgão público
         *
         * <p>- Esse campo pode ser repetido até 500 vezes
         *
         * <p>DESCRICAO_COMPLETA:Identificação da unidade do órgão público na qual o beneficiário
         * possui provento ou pensão.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
         *
         * @return O objeto T_ideEstab para população dos campos filhos
         */
        public T_ideEstab<InfoPerApur<T>> setIdeEstab_Next() {
          if (this.ideEstab == null) {
            this.ideEstab = new java.util.ArrayList<>();
          }
          T_ideEstab toAdd = new T_ideEstab(this);
          this.ideEstab.add(toAdd);
          return toAdd;
        }

        public InfoPerApur(Object pai) {
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
       * Informações relativas a períodos anteriores
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "idePeriodo",
          })
      public static class InfoPerAnt<T> {

        /**
         * Identificação do período de referência do provento ou pensão
         *
         * <p>- Esse campo pode ser repetido até 180 vezes
         */
        private java.util.List<IdePeriodo> idePeriodo;

        /**
         * Identificação do período de referência do provento ou pensão
         *
         * @return Conteúdo do campo idePeriodo
         */
        public java.util.List<IdePeriodo> getIdePeriodo() {
          return this.idePeriodo;
        }

        /**
         * Identificação do período de referência do provento ou pensão
         *
         * <p>- Esse campo pode ser repetido até 180 vezes
         *
         * <p>DESCRICAO_COMPLETA:Identificação do período ao qual se referem as diferenças de
         * provento ou pensão.
         *
         * <p>CHAVE_GRUPO: {perRef}
         *
         * @return O objeto IdePeriodo para população dos campos filhos
         */
        public IdePeriodo<InfoPerAnt<T>> setIdePeriodo_Next() {
          if (this.idePeriodo == null) {
            this.idePeriodo = new java.util.ArrayList<>();
          }
          IdePeriodo toAdd = new IdePeriodo(this);
          this.idePeriodo.add(toAdd);
          return toAdd;
        }

        public InfoPerAnt(Object pai) {
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
         * Identificação do período de referência do provento ou pensão
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "perRef",
              "ideEstab",
            })
        public static class IdePeriodo<T> {

          /**
           * Informar o período ao qual se refere o complemento de provento ou pensão, no formato
           * AAAA-MM.
           */
          private String perRef;

          /**
           * Identificação da unidade do órgão público
           *
           * <p>- Esse campo pode ser repetido até 500 vezes
           */
          private java.util.List<T_ideEstab> ideEstab;

          /**
           * Informar o período ao qual se refere o complemento de provento ou pensão, no formato
           * AAAA-MM.
           *
           * @return Conteúdo do campo perRef
           */
          public String getPerRef() {
            return this.perRef;
          }

          /**
           * Informar o período ao qual se refere o complemento de provento ou pensão, no formato
           * AAAA-MM.
           *
           * <p>Validação: Deve ser igual ou anterior ao período de apuração informado em
           * {perApur}(1207_ideEvento_perApur).
           *
           * @param perRef Valor para atribuir ao campo perRef
           * @return O próprio IdePeriodo para continuar populando outros campos
           */
          public IdePeriodo<T> setPerRef(String perRef) {
            this.perRef = perRef;
            return this;
          }

          /**
           * Identificação da unidade do órgão público
           *
           * @return Conteúdo do campo ideEstab
           */
          public java.util.List<T_ideEstab> getIdeEstab() {
            return this.ideEstab;
          }

          /**
           * Identificação da unidade do órgão público
           *
           * <p>- Esse campo pode ser repetido até 500 vezes
           *
           * <p>DESCRICAO_COMPLETA:Identificação da unidade do órgão público na qual o beneficiário
           * possui provento ou pensão.
           *
           * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
           *
           * @return O objeto T_ideEstab para população dos campos filhos
           */
          public T_ideEstab<IdePeriodo<T>> setIdeEstab_Next() {
            if (this.ideEstab == null) {
              this.ideEstab = new java.util.ArrayList<>();
            }
            T_ideEstab toAdd = new T_ideEstab(this);
            this.ideEstab.add(toAdd);
            return toAdd;
          }

          public IdePeriodo(Object pai) {
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

  /**
   * Identificação da unidade do órgão público
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc",
        "nrInsc",
        "itensRemun",
      })
  public static class T_ideEstab<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /** Informar o número de inscrição da unidade do órgão público. */
    private String nrInsc;

    /**
     * Itens que compõem o provento ou pensão do beneficiário
     *
     * <p>- Esse campo pode ser repetido até 200 vezes
     */
    private java.util.List<Tipos.T_itensRemun_rpps> itensRemun;

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
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setTpInsc(String tpInsc) {
      if (!"1".equals(tpInsc))
        throw new RuntimeException(
            "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
      this.tpInsc = tpInsc;
      return this;
    }
    /**
     * CNPJ
     *
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setTpInsc_1() {
      this.tpInsc = "1";
      return this;
    }

    /**
     * Informar o número de inscrição da unidade do órgão público.
     *
     * @return Conteúdo do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição da unidade do órgão público.
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_ideEstab para continuar populando outros campos
     */
    public T_ideEstab<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    /**
     * Itens que compõem o provento ou pensão do beneficiário
     *
     * @return Conteúdo do campo itensRemun
     */
    public java.util.List<Tipos.T_itensRemun_rpps> getItensRemun() {
      return this.itensRemun;
    }

    /**
     * Itens que compõem o provento ou pensão do beneficiário
     *
     * <p>- Esse campo pode ser repetido até 200 vezes
     *
     * <p>DESCRICAO_COMPLETA:Rubricas que compõem o provento ou pensão do beneficiário.
     *
     * @return O objeto Tipos.T_itensRemun_rpps para população dos campos filhos
     */
    public Tipos.T_itensRemun_rpps<T_ideEstab<T>> setItensRemun_Next() {
      if (this.itensRemun == null) {
        this.itensRemun = new java.util.ArrayList<>();
      }
      Tipos.T_itensRemun_rpps toAdd = new Tipos.T_itensRemun_rpps(this);
      this.itensRemun.add(toAdd);
      return toAdd;
    }

    public T_ideEstab(Object pai) {
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
