package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-3000 - Exclusão de Eventos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtExclusao",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Exclusao {

  /** Evento Exclusão */
  private EvtExclusao evtExclusao;

  /**
   * Evento Exclusão
   *
   * @return Conteúdo do campo evtExclusao
   */
  public EvtExclusao getEvtExclusao() {
    return this.evtExclusao;
  }

  /**
   * Evento Exclusão
   *
   * <p>DESCRICAO_COMPLETA:Evento Exclusão de Eventos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVE_EXCLUSAO_VALIDA_NRRECIBO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_DOMESTICO
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * @return O objeto EvtExclusao para população dos campos filhos
   */
  public EvtExclusao<Evento_Exclusao> setEvtExclusao() {
    if (this.evtExclusao == null) {
      this.evtExclusao = new EvtExclusao(this);
    }
    return this.evtExclusao;
  }

  /**
   * Evento Exclusão
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoExclusao",
      })
  public static class EvtExclusao<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informação do evento que será excluído */
    private InfoExclusao infoExclusao;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_evtTab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_evtTab para população dos campos filhos
     */
    public Tipos.T_ideEvento_evtTab<EvtExclusao<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_evtTab(this);
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
    public Tipos.T_ideEmpregador<EvtExclusao<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informação do evento que será excluído
     *
     * @return Conteúdo do campo infoExclusao
     */
    public InfoExclusao getInfoExclusao() {
      return this.infoExclusao;
    }

    /**
     * Informação do evento que será excluído
     *
     * <p>DESCRICAO_COMPLETA:Grupo que identifica o evento objeto da exclusão.
     *
     * @return O objeto InfoExclusao para população dos campos filhos
     */
    public InfoExclusao<EvtExclusao<T>> setInfoExclusao() {
      if (this.infoExclusao == null) {
        this.infoExclusao = new InfoExclusao(this);
      }
      return this.infoExclusao;
    }

    public EvtExclusao(Object pai) {
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
     * Informação do evento que será excluído
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpEvento",
          "nrRecEvt",
          "ideTrabalhador",
          "ideFolhaPagto",
        })
    public static class InfoExclusao<T> {

      /** Preencher com o tipo de evento. */
      private String tpEvento;

      /** Preencher com o número do recibo do evento que será excluído. */
      private String nrRecEvt;

      /** Identificação do trabalhador a que se refere o evento a ser excluído */
      private IdeTrabalhador ideTrabalhador;

      /** Identificação do período de apuração a que se refere o evento que será excluído */
      private IdeFolhaPagto ideFolhaPagto;

      /**
       * Preencher com o tipo de evento.
       *
       * @return Conteúdo do campo tpEvento
       */
      public String getTpEvento() {
        return this.tpEvento;
      }

      /**
       * Preencher com o tipo de evento.
       *
       * <p>Validação: Deve existir na Tabela 09. Podem ser excluídos apenas os eventos relacionados
       * abaixo:
       *
       * <p>a) Não periódicos (S-2190 a S-2420);
       *
       * <p>b) Periódicos (S-1200 a S-1280).
       *
       * @param tpEvento Valor para atribuir ao campo tpEvento
       * @return O próprio InfoExclusao para continuar populando outros campos
       */
      public InfoExclusao<T> setTpEvento(String tpEvento) {
        this.tpEvento = tpEvento;
        return this;
      }

      /**
       * Preencher com o número do recibo do evento que será excluído.
       *
       * @return Conteúdo do campo nrRecEvt
       */
      public String getNrRecEvt() {
        return this.nrRecEvt;
      }

      /**
       * Preencher com o número do recibo do evento que será excluído.
       *
       * <p>Validação: O recibo deve ser relativo ao mesmo tipo de evento indicado em
       * {tpEvento}(./tpEvento) e o respectivo evento não deve constar como excluído ou retificado.
       * Além disso, no caso de exclusão de eventos em que existe a identificação do trabalhador, o
       * evento que está sendo excluído deve referir-se ao mesmo trabalhador identificado por
       * {cpfTrab}(./ideTrabalhador_cpfTrab).
       *
       * @param nrRecEvt Valor para atribuir ao campo nrRecEvt
       * @return O próprio InfoExclusao para continuar populando outros campos
       */
      public InfoExclusao<T> setNrRecEvt(String nrRecEvt) {
        this.nrRecEvt = nrRecEvt;
        return this;
      }

      /**
       * Identificação do trabalhador a que se refere o evento a ser excluído
       *
       * @return Conteúdo do campo ideTrabalhador
       */
      public IdeTrabalhador getIdeTrabalhador() {
        return this.ideTrabalhador;
      }

      /**
       * Identificação do trabalhador a que se refere o evento a ser excluído
       *
       * <p>DESCRICAO_COMPLETA:Grupo que identifica a qual trabalhador se refere o evento a ser
       * excluído.
       *
       * <p>CONDICAO_GRUPO: O (se {tpEvento}(../tpEvento) corresponder a um dos eventos não
       * periódicos (S-2190 a S-2420) ou um dos eventos periódicos (S-1200 a S-1210); N (nos demais
       * casos)
       *
       * @return O objeto IdeTrabalhador para população dos campos filhos
       */
      public IdeTrabalhador<InfoExclusao<T>> setIdeTrabalhador() {
        if (this.ideTrabalhador == null) {
          this.ideTrabalhador = new IdeTrabalhador(this);
        }
        return this.ideTrabalhador;
      }

      /**
       * Identificação do período de apuração a que se refere o evento que será excluído
       *
       * @return Conteúdo do campo ideFolhaPagto
       */
      public IdeFolhaPagto getIdeFolhaPagto() {
        return this.ideFolhaPagto;
      }

      /**
       * Identificação do período de apuração a que se refere o evento que será excluído
       *
       * <p>DESCRICAO_COMPLETA:Grupo que identifica a qual período de apuração pertence o evento que
       * será excluído.
       *
       * <p>CONDICAO_GRUPO: O (se {tpEvento}(../tpEvento) corresponder a um dos eventos periódicos
       * (S-1200 a S-1280)); N (nos demais casos)
       *
       * @return O objeto IdeFolhaPagto para população dos campos filhos
       */
      public IdeFolhaPagto<InfoExclusao<T>> setIdeFolhaPagto() {
        if (this.ideFolhaPagto == null) {
          this.ideFolhaPagto = new IdeFolhaPagto(this);
        }
        return this.ideFolhaPagto;
      }

      public InfoExclusao(Object pai) {
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
       * Identificação do trabalhador a que se refere o evento a ser excluído
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

        /** Preencher com o número do CPF do trabalhador ou do beneficiário. */
        private String cpfTrab;

        /**
         * Preencher com o número do CPF do trabalhador ou do beneficiário.
         *
         * @return Conteúdo do campo cpfTrab
         */
        public String getCpfTrab() {
          return this.cpfTrab;
        }

        /**
         * Preencher com o número do CPF do trabalhador ou do beneficiário.
         *
         * <p>Validação: O CPF indicado deve existir na base de dados do RET.
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
       * Identificação do período de apuração a que se refere o evento que será excluído
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "indApuracao",
            "perApur",
          })
      public static class IdeFolhaPagto<T> {

        /** Indicativo de período de apuração. */
        private String indApuracao;

        /**
         * Informar o mês/ano (formato AAAA-MM) ou apenas o ano (formato AAAA) de referência das
         * informações.
         */
        private String perApur;

        /**
         * Indicativo de período de apuração.
         *
         * @return Conteúdo do campo indApuracao
         */
        public String getIndApuracao() {
          return this.indApuracao;
        }

        /**
         * Indicativo de período de apuração.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se {tpEvento}(../tpEvento) = [S-1200,
         * S-1202, S-1207, S-1280].
         *
         * @param indApuracao Valor para atribuir ao campo indApuracao
         * @return O próprio IdeFolhaPagto para continuar populando outros campos
         */
        public IdeFolhaPagto<T> setIndApuracao(String indApuracao) {
          if (!"1".equals(indApuracao) && !"2".equals(indApuracao))
            throw new RuntimeException(
                "Valor " + String.valueOf(indApuracao) + " inválido para o campo indApuracao");
          this.indApuracao = indApuracao;
          return this;
        }
        /**
         * Mensal
         *
         * @return O próprio IdeFolhaPagto para continuar populando outros campos
         */
        public IdeFolhaPagto<T> setIndApuracao_1() {
          this.indApuracao = "1";
          return this;
        }
        /**
         * Anual (13° salário)
         *
         * @return O próprio IdeFolhaPagto para continuar populando outros campos
         */
        public IdeFolhaPagto<T> setIndApuracao_2() {
          this.indApuracao = "2";
          return this;
        }

        /**
         * Informar o mês/ano (formato AAAA-MM) ou apenas o ano (formato AAAA) de referência das
         * informações.
         *
         * @return Conteúdo do campo perApur
         */
        public String getPerApur() {
          return this.perApur;
        }

        /**
         * Informar o mês/ano (formato AAAA-MM) ou apenas o ano (formato AAAA) de referência das
         * informações.
         *
         * <p>Validação: Deve ser um mês/ano ou ano válido, posterior à implementação do eSocial.
         * Somente pode ser informado ano (formato AAAA) se {indApuracao}(./indApuracao) = [2].
         *
         * @param perApur Valor para atribuir ao campo perApur
         * @return O próprio IdeFolhaPagto para continuar populando outros campos
         */
        public IdeFolhaPagto<T> setPerApur(String perApur) {
          this.perApur = perApur;
          return this;
        }

        public IdeFolhaPagto(Object pai) {
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
