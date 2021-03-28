package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-5001 - Informações das Contribuições Sociais por Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtBasesTrab",
    })
@XmlRootElement(name = "eSocial")
public class Evento_BasesTrab {

  /** Evento Informações das Contribuições Sociais por Trabalhador. */
  private EvtBasesTrab evtBasesTrab;

  /**
   * Evento Informações das Contribuições Sociais por Trabalhador.
   *
   * @return Conteúdo do campo evtBasesTrab
   */
  public EvtBasesTrab getEvtBasesTrab() {
    return this.evtBasesTrab;
  }

  /**
   * Evento Informações das Contribuições Sociais por Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * @return O objeto EvtBasesTrab para população dos campos filhos
   */
  public EvtBasesTrab<Evento_BasesTrab> setEvtBasesTrab() {
    if (this.evtBasesTrab == null) {
      this.evtBasesTrab = new EvtBasesTrab(this);
    }
    return this.evtBasesTrab;
  }

  /**
   * Evento Informações das Contribuições Sociais por Trabalhador.
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
        "infoCpCalc",
        "infoCp",
      })
  public static class EvtBasesTrab<T> {

    /** Identificação do evento de retorno. */
    private Tipos.T_ideEvento_retorno_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do trabalhador. */
    private IdeTrabalhador ideTrabalhador;

    /**
     * Cálculo da contribuição previdenciária do segurado
     *
     * <p>- Esse campo pode ser repetido até 9 vezes
     */
    private java.util.List<InfoCpCalc> infoCpCalc;

    /** Informações sobre bases e valores das contribuições sociais */
    private InfoCp infoCp;

    /**
     * Identificação do evento de retorno.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_retorno_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Identificação do evento de retorno.
     *
     * @return O objeto Tipos.T_ideEvento_retorno_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_retorno_trab<EvtBasesTrab<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_retorno_trab(this);
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
    public Tipos.T_ideEmpregador<EvtBasesTrab<T>> setIdeEmpregador() {
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
    public IdeTrabalhador<EvtBasesTrab<T>> setIdeTrabalhador() {
      if (this.ideTrabalhador == null) {
        this.ideTrabalhador = new IdeTrabalhador(this);
      }
      return this.ideTrabalhador;
    }

    /**
     * Cálculo da contribuição previdenciária do segurado
     *
     * @return Conteúdo do campo infoCpCalc
     */
    public java.util.List<InfoCpCalc> getInfoCpCalc() {
      return this.infoCpCalc;
    }

    /**
     * Cálculo da contribuição previdenciária do segurado
     *
     * <p>- Esse campo pode ser repetido até 9 vezes
     *
     * <p>DESCRICAO_COMPLETA:Cálculo da contribuição previdenciária do segurado, incidente sobre a
     * remuneração do período de apuração e de períodos anteriores informada nos eventos S-1200,
     * S-2299 e S-2399.
     *
     * <p>CHAVE_GRUPO: {tpCR}
     *
     * <p>CONDICAO_GRUPO: OC
     *
     * @return O objeto InfoCpCalc para população dos campos filhos
     */
    public InfoCpCalc<EvtBasesTrab<T>> setInfoCpCalc_Next() {
      if (this.infoCpCalc == null) {
        this.infoCpCalc = new java.util.ArrayList<>();
      }
      InfoCpCalc toAdd = new InfoCpCalc(this);
      this.infoCpCalc.add(toAdd);
      return toAdd;
    }

    /**
     * Informações sobre bases e valores das contribuições sociais
     *
     * @return Conteúdo do campo infoCp
     */
    public InfoCp getInfoCp() {
      return this.infoCp;
    }

    /**
     * Informações sobre bases e valores das contribuições sociais
     *
     * <p>DESCRICAO_COMPLETA:Informações sobre bases de cálculo, descontos e deduções de
     * contribuições sociais devidas à Previdência Social e a Outras Entidades e Fundos, referentes
     * à remuneração do período de apuração e de períodos anteriores informada nos eventos S-1200,
     * S-2299 e S-2399.
     *
     * <p>CONDICAO_GRUPO: OC
     *
     * @return O objeto InfoCp para população dos campos filhos
     */
    public InfoCp<EvtBasesTrab<T>> setInfoCp() {
      if (this.infoCp == null) {
        this.infoCp = new InfoCp(this);
      }
      return this.infoCp;
    }

    public EvtBasesTrab(Object pai) {
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
          "infoCompl",
          "procJudTrab",
        })
    public static class IdeTrabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /** Informações complementares do trabalhador e do contrato. */
      private InfoCompl infoCompl;

      /**
       * Processos judiciais do trabalhador
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<ProcJudTrab> procJudTrab;

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
       * <p>Validação: Deve ser um CPF constante no arquivo gerado pelo empregador no evento de
       * origem.
       *
       * @param cpfTrab Valor para atribuir ao campo cpfTrab
       * @return O próprio IdeTrabalhador para continuar populando outros campos
       */
      public IdeTrabalhador<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      /**
       * Informações complementares do trabalhador e do contrato.
       *
       * @return Conteúdo do campo infoCompl
       */
      public InfoCompl getInfoCompl() {
        return this.infoCompl;
      }

      /**
       * Informações complementares do trabalhador e do contrato.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoCompl para população dos campos filhos
       */
      public InfoCompl<IdeTrabalhador<T>> setInfoCompl() {
        if (this.infoCompl == null) {
          this.infoCompl = new InfoCompl(this);
        }
        return this.infoCompl;
      }

      /**
       * Processos judiciais do trabalhador
       *
       * @return Conteúdo do campo procJudTrab
       */
      public java.util.List<ProcJudTrab> getProcJudTrab() {
        return this.procJudTrab;
      }

      /**
       * Processos judiciais do trabalhador
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre processos judiciais do trabalhador com decisão
       * favorável quanto à não incidência ou alterações na incidência de contribuição
       * previdenciária.
       *
       * <p>CHAVE_GRUPO: {nrProcJud}
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto ProcJudTrab para população dos campos filhos
       */
      public ProcJudTrab<IdeTrabalhador<T>> setProcJudTrab_Next() {
        if (this.procJudTrab == null) {
          this.procJudTrab = new java.util.ArrayList<>();
        }
        ProcJudTrab toAdd = new ProcJudTrab(this);
        this.procJudTrab.add(toAdd);
        return toAdd;
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
      /**
       * Informações complementares do trabalhador e do contrato.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "sucessaoVinc",
            "infoInterm",
            "infoComplCont",
          })
      public static class InfoCompl<T> {

        /** Grupo de informações da sucessão de vínculo trabalhista */
        private Tipos.T_sucessaoVinc sucessaoVinc;

        /**
         * Informações relativas ao trabalho intermitente
         *
         * <p>- Esse campo pode ser repetido até 31 vezes
         */
        private java.util.List<InfoInterm> infoInterm;

        /**
         * Informações complementares contratuais do trabalhador
         *
         * <p>- Esse campo pode ser repetido indefinidas vezes
         */
        private java.util.List<InfoComplCont> infoComplCont;

        /**
         * Grupo de informações da sucessão de vínculo trabalhista
         *
         * @return Conteúdo do campo sucessaoVinc
         */
        public Tipos.T_sucessaoVinc getSucessaoVinc() {
          return this.sucessaoVinc;
        }

        /**
         * Grupo de informações da sucessão de vínculo trabalhista
         *
         * <p>DESCRICAO_COMPLETA:Grupo de informações da sucessão de vínculo trabalhista.
         *
         * <p>Evento de origem: S-1200.
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto Tipos.T_sucessaoVinc para população dos campos filhos
         */
        public Tipos.T_sucessaoVinc<InfoCompl<T>> setSucessaoVinc() {
          if (this.sucessaoVinc == null) {
            this.sucessaoVinc = new Tipos.T_sucessaoVinc(this);
          }
          return this.sucessaoVinc;
        }

        /**
         * Informações relativas ao trabalho intermitente
         *
         * @return Conteúdo do campo infoInterm
         */
        public java.util.List<InfoInterm> getInfoInterm() {
          return this.infoInterm;
        }

        /**
         * Informações relativas ao trabalho intermitente
         *
         * <p>- Esse campo pode ser repetido até 31 vezes
         *
         * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalho intermitente.
         *
         * <p>Evento de origem: S-1200 ou S-2299.
         *
         * <p>CHAVE_GRUPO: {dia}
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto InfoInterm para população dos campos filhos
         */
        public InfoInterm<InfoCompl<T>> setInfoInterm_Next() {
          if (this.infoInterm == null) {
            this.infoInterm = new java.util.ArrayList<>();
          }
          InfoInterm toAdd = new InfoInterm(this);
          this.infoInterm.add(toAdd);
          return toAdd;
        }

        /**
         * Informações complementares contratuais do trabalhador
         *
         * @return Conteúdo do campo infoComplCont
         */
        public java.util.List<InfoComplCont> getInfoComplCont() {
          return this.infoComplCont;
        }

        /**
         * Informações complementares contratuais do trabalhador
         *
         * <p>- Esse campo pode ser repetido indefinidas vezes
         *
         * <p>DESCRICAO_COMPLETA:Informações complementares contratuais do trabalhador.
         *
         * <p>Evento de origem: S-1200.
         *
         * <p>CHAVE_GRUPO: {codCBO}, {natAtividade}, {qtdDiasTrab}
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto InfoComplCont para população dos campos filhos
         */
        public InfoComplCont<InfoCompl<T>> setInfoComplCont_Next() {
          if (this.infoComplCont == null) {
            this.infoComplCont = new java.util.ArrayList<>();
          }
          InfoComplCont toAdd = new InfoComplCont(this);
          this.infoComplCont.add(toAdd);
          return toAdd;
        }

        public InfoCompl(Object pai) {
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
         * Informações relativas ao trabalho intermitente
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "dia",
            })
        public static class InfoInterm<T> {

          /**
           * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho
           * intermitente.
           */
          private String dia;

          /**
           * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho
           * intermitente.
           *
           * @return Conteúdo do campo dia
           */
          public String getDia() {
            return this.dia;
          }

          /**
           * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho
           * intermitente.
           *
           * @param dia Valor para atribuir ao campo dia
           * @return O próprio InfoInterm para continuar populando outros campos
           */
          public InfoInterm<T> setDia(String dia) {
            this.dia = dia;
            return this;
          }

          public InfoInterm(Object pai) {
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
         * Informações complementares contratuais do trabalhador
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "codCBO",
              "natAtividade",
              "qtdDiasTrab",
            })
        public static class InfoComplCont<T> {

          /** Classificação Brasileira de Ocupações - CBO. */
          private String codCBO;

          /** Natureza da atividade. */
          private String natAtividade;

          /**
           * Informação prestada exclusivamente pelo segurado especial em caso de contratação de
           * contribuinte individual, indicando a quantidade de dias trabalhados pelo mesmo.
           */
          private String qtdDiasTrab;

          /**
           * Classificação Brasileira de Ocupações - CBO.
           *
           * @return Conteúdo do campo codCBO
           */
          public String getCodCBO() {
            return this.codCBO;
          }

          /**
           * Classificação Brasileira de Ocupações - CBO.
           *
           * @param codCBO Valor para atribuir ao campo codCBO
           * @return O próprio InfoComplCont para continuar populando outros campos
           */
          public InfoComplCont<T> setCodCBO(String codCBO) {
            this.codCBO = codCBO;
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
           * @param natAtividade Valor para atribuir ao campo natAtividade
           * @return O próprio InfoComplCont para continuar populando outros campos
           */
          public InfoComplCont<T> setNatAtividade(String natAtividade) {
            if (!"1".equals(natAtividade) && !"2".equals(natAtividade))
              throw new RuntimeException(
                  "Valor " + String.valueOf(natAtividade) + " inválido para o campo natAtividade");
            this.natAtividade = natAtividade;
            return this;
          }
          /**
           * Trabalho urbano
           *
           * @return O próprio InfoComplCont para continuar populando outros campos
           */
          public InfoComplCont<T> setNatAtividade_1() {
            this.natAtividade = "1";
            return this;
          }
          /**
           * Trabalho rural
           *
           * @return O próprio InfoComplCont para continuar populando outros campos
           */
          public InfoComplCont<T> setNatAtividade_2() {
            this.natAtividade = "2";
            return this;
          }

          /**
           * Informação prestada exclusivamente pelo segurado especial em caso de contratação de
           * contribuinte individual, indicando a quantidade de dias trabalhados pelo mesmo.
           *
           * @return Conteúdo do campo qtdDiasTrab
           */
          public String getQtdDiasTrab() {
            return this.qtdDiasTrab;
          }

          /**
           * Informação prestada exclusivamente pelo segurado especial em caso de contratação de
           * contribuinte individual, indicando a quantidade de dias trabalhados pelo mesmo.
           *
           * @param qtdDiasTrab Valor para atribuir ao campo qtdDiasTrab
           * @return O próprio InfoComplCont para continuar populando outros campos
           */
          public InfoComplCont<T> setQtdDiasTrab(String qtdDiasTrab) {
            this.qtdDiasTrab = qtdDiasTrab;
            return this;
          }

          public InfoComplCont(Object pai) {
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
       * Processos judiciais do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nrProcJud",
            "codSusp",
          })
      public static class ProcJudTrab<T> {

        /** Informar o número do processo judicial. */
        private String nrProcJud;

        /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
        private Integer codSusp;

        /**
         * Informar o número do processo judicial.
         *
         * @return Conteúdo do campo nrProcJud
         */
        public String getNrProcJud() {
          return this.nrProcJud;
        }

        /**
         * Informar o número do processo judicial.
         *
         * <p>Origem: campo {nrProcJud} de S-1200, S-2299 ou S-2399, se {tpTrib} no evento de origem
         * for igual a [2].
         *
         * @param nrProcJud Valor para atribuir ao campo nrProcJud
         * @return O próprio ProcJudTrab para continuar populando outros campos
         */
        public ProcJudTrab<T> setNrProcJud(String nrProcJud) {
          this.nrProcJud = nrProcJud;
          return this;
        }

        /**
         * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
         *
         * @return Conteúdo do campo codSusp
         */
        public Integer getCodSusp() {
          return this.codSusp;
        }

        /**
         * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
         *
         * <p>Origem: campo {codSusp} de S-1200, S-2299 ou S-2399, se {tpTrib} no evento de origem
         * for igual a [2].
         *
         * @param codSusp Valor para atribuir ao campo codSusp
         * @return O próprio ProcJudTrab para continuar populando outros campos
         */
        public ProcJudTrab<T> setCodSusp(Integer codSusp) {
          this.codSusp = codSusp;
          return this;
        }

        public ProcJudTrab(Object pai) {
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
     * Cálculo da contribuição previdenciária do segurado
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpCR",
          "vrCpSeg",
          "vrDescSeg",
        })
    public static class InfoCpCalc<T> {

      /** Código de Receita - CR da contribuição descontada do trabalhador. */
      private Integer tpCR;

      /**
       * Valor da contribuição do segurado, devida à Previdência Social, calculada segundo as regras
       * da legislação em vigor, por CR.
       */
      private Double vrCpSeg;

      /**
       * Valor efetivamente descontado do segurado, correspondente a
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [21] do
       * correspondente {infoCpCalc/tpCR}(./tpCR).
       */
      private Double vrDescSeg;

      /**
       * Código de Receita - CR da contribuição descontada do trabalhador.
       *
       * @return Conteúdo do campo tpCR
       */
      public Integer getTpCR() {
        return this.tpCR;
      }

      /**
       * Código de Receita - CR da contribuição descontada do trabalhador.
       *
       * <p>Validação: Se {indApuracao}(5001_ideEvento_indApuracao) = [2], deve ser igual a [108221,
       * 108222, 108223, 108224].
       *
       * @param tpCR Valor para atribuir ao campo tpCR
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR(Integer tpCR) {
        if (!"108201".equals(tpCR)
            && !"108202".equals(tpCR)
            && !"108203".equals(tpCR)
            && !"108204".equals(tpCR)
            && !"108221".equals(tpCR)
            && !"108222".equals(tpCR)
            && !"108223".equals(tpCR)
            && !"108224".equals(tpCR)
            && !"109901".equals(tpCR)
            && !"109902".equals(tpCR))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpCR) + " inválido para o campo tpCR");
        this.tpCR = tpCR;
        return this;
      }
      /**
       * Contribuição Previdenciária - CP descontada do segurado empregado/avulso
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108201() {
        this.tpCR = "108201";
        return this;
      }
      /**
       * CP descontada do segurado empregado rural curto prazo - Lei 11.718/2008
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108202() {
        this.tpCR = "108202";
        return this;
      }
      /**
       * CP descontada do segurado empregado doméstico ou segurado especial
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108203() {
        this.tpCR = "108203";
        return this;
      }
      /**
       * CP descontada do segurado especial curto prazo - Lei 11.718/2008
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108204() {
        this.tpCR = "108204";
        return this;
      }
      /**
       * CP descontada do segurado empregado/avulso 13° salário
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108221() {
        this.tpCR = "108221";
        return this;
      }
      /**
       * CP descontada do segurado empregado rural curto prazo 13° salário - Lei 11.718/2008
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108222() {
        this.tpCR = "108222";
        return this;
      }
      /**
       * CP descontada do segurado empregado doméstico ou segurado especial 13° salário
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108223() {
        this.tpCR = "108223";
        return this;
      }
      /**
       * CP descontada do segurado especial curto prazo 13° salário - Lei 11.718/2008
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_108224() {
        this.tpCR = "108224";
        return this;
      }
      /**
       * CP descontada do contribuinte individual, alíquota de 11%
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_109901() {
        this.tpCR = "109901";
        return this;
      }
      /**
       * CP descontada do contribuinte individual, alíquota de 20%
       *
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setTpCR_109902() {
        this.tpCR = "109902";
        return this;
      }

      /**
       * Valor da contribuição do segurado, devida à Previdência Social, calculada segundo as regras
       * da legislação em vigor, por CR.
       *
       * @return Conteúdo do campo vrCpSeg
       */
      public Double getVrCpSeg() {
        return this.vrCpSeg;
      }

      /**
       * Valor da contribuição do segurado, devida à Previdência Social, calculada segundo as regras
       * da legislação em vigor, por CR.
       *
       * <p>Validação: 1. Se {indMV} do S-1200/S-2299/S-2399 = [3], {vrCpSeg}(./vrCpSeg) = [0];
       * portanto, não há CR.
       *
       * <p>
       *
       * <p>2. Se {indMV} do S-1200/S-2299/S-2399 = [1, 2], efetuar o somatório das ocorrências do
       * campo {vlrRemunOE} e o somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14,
       * 19], resultando em [TotalRemun]. Este procedimento visa a identificação da(s) alíquota(s)
       * aplicável(eis):
       *
       * <p>2.1. Se {indMV} do S-1200/S-2299/S-2399 = [1], aplicar a(s) alíquota(s) conforme a
       * categoria do segurado sobre a remuneração paga pelo declarante (somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14,
       * 19]), observado o limite máximo do salário de contribuição.
       *
       * <p>2.2. Se {indMV} do S-1200/S-2299/S-2399 = [2]:
       *
       * <p>a) Se [TotalRemun] ultrapassar o limite máximo do salário de contribuição, aplicar a(s)
       * alíquota(s) conforme a categoria do segurado sobre a diferença entre o referido limite
       * máximo e o somatório das ocorrências do campo {vlrRemunOE}. Para os períodos de apuração
       * iguais ou posteriores a 03/2020, observar a(s) faixa(s) de remuneração já tributada(s) em
       * outra(s) empresa(s) nas categorias empregado/avulso/agente público.
       *
       * <p>b) Se [TotalRemun] for inferior ao limite máximo do salário de contribuição:
       *
       * <p>b1) Para as categorias empregado/avulso/agente público: somar {vlrRemunOE} destas mesmas
       * categorias com o somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14, 19]
       * e aplicar a(s) alíquota(s). Para os períodos de apuração iguais ou posteriores a 03/2020,
       * observar a(s) faixa(s) de remuneração já tributada(s) em outra(s) empresa(s) nas categorias
       * empregado/avulso/agente público.
       *
       * <p>b2) Para categoria contribuinte individual: aplicar a alíquota sobre a remuneração paga
       * pelo declarante (somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14,
       * 19]).
       *
       * <p>
       *
       * <p>3. Se não for informado o grupo {infoMV} do S-1200/S-2299/S-2399:
       *
       * <p>a) Se o trabalhador presta serviço para a empresa declarante em apenas uma categoria
       * ({codCateg}(5001_infoCp_ideEstabLot_infoCategIncid_codCateg)), efetuar o somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14, 19]
       * e aplicar a(s) alíquota(s) conforme a categoria.
       *
       * <p>b) Se o trabalhador presta serviço para a empresa declarante em mais de uma categoria
       * ({codCateg}(5001_infoCp_ideEstabLot_infoCategIncid_codCateg)):
       *
       * <p>I. Efetuar o somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14, 19]
       * para todas as categorias de segurado empregado/avulso/agente público e aplicar a(s)
       * alíquota(s) correta(s) conforme faixa salarial, observado o limite máximo do salário de
       * contribuição.
       *
       * <p>II. Caso o somatório do item I não tenha atingido o limite máximo do salário de
       * contribuição, efetuar o somatório de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) quando
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [11, 12, 13, 14, 19]
       * para todas as categorias diferentes de segurado empregado e aplicar a alíquota correta
       * conforme a categoria, observado o limite máximo do salário de contribuição.
       *
       * <p>
       *
       * <p>OBS.: a) No caso de {indApuracao}(5001_ideEvento_indApuracao) = [1], o cálculo deve ser
       * efetuado separadamente para
       * {infoBaseCS/ind13}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_ind13) = [0] e
       * {infoBaseCS/ind13}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_ind13) = [1]. A soma
       * de ambos os cálculos deve corresponder ao valor de {vrCpSeg}(./vrCpSeg).
       *
       * <p>b) Aplica-se a alíquota de 20% para o cálculo da contribuição previdenciária a ser
       * descontada de remuneração de trabalhador pertencente às categorias [731, 734], quando o
       * empregador for cooperativa de trabalho
       * ({indCoop}(1000_infoEmpregador_inclusao_infoCadastro_indCoop) em S-1000 = [1]), ou
       * pertencente ao grupo "Contribuinte Individual", quando o Empregador tiver classificação
       * tributária ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000) =
       * [70, 80]). Caso o trabalhador receba remuneração da empresa em outra categoria do grupo
       * "Contribuinte Individual", primeiro deve ser aplicado o desconto sobre essa categoria (7XX)
       * e depois sobre a remuneração das categorias [731, 734], observado o limite máximo do
       * salário de contribuição.
       *
       * <p>c) {vrCpSeg}(./vrCpSeg) deve ser igual a {vrDescSeg}(./vrDescSeg) nas seguintes
       * situações:
       *
       * <p>c1) Se houver informações em {infoPerAnt} na composição de
       * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor);
       *
       * <p>c2) Se houver informação de {procJudTrab} com {tpTrib} = [2] nos eventos que contenham
       * informações de remuneração (S-1200, S-2299 e S-2399);
       *
       * <p>c3) Se houver processo do empregador informado em S-1010, contestando incidência de
       * contribuição previdenciária em rubricas utilizadas na composição da remuneração do
       * trabalhador;
       *
       * <p>c4) Se, no período de apuração mensal, houver remuneração referente a 13º salário
       * ({codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [12, 14, 16, 22,
       * 26, 32, 92, 94, 96, 98]). Nesse caso, o campo {vrCpSeg}(./vrCpSeg) será igual ao valor
       * calculado sobre a remuneração mensal acrescido do desconto sobre a remuneração relativa a
       * 13° salário informado pelo empregador;
       *
       * <p>c5) se {procEmi} do evento S-1200/S-2299/S-2399 for igual a [2, 4, 22].
       *
       * <p>d) No caso de trabalhador categoria = [102], utilizar somente a alíquota de 8%,
       * observado o limite máximo do salário de contribuição.
       *
       * <p>e) No caso de empregador com
       * {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [21, 60], não
       * calcular para a categoria do grupo "Contribuinte Individual" (7XX). O valor deve ser
       * zerado.
       *
       * <p>f) Não calcular quando a categoria do trabalhador for [741] (MEI). O valor deve ser
       * zerado.
       *
       * <p>g) Não calcular quando a lotação tributária for [91]. O valor deve ser zerado.
       *
       * @param vrCpSeg Valor para atribuir ao campo vrCpSeg
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setVrCpSeg(Double vrCpSeg) {
        this.vrCpSeg = vrCpSeg;
        return this;
      }

      /**
       * Valor efetivamente descontado do segurado, correspondente a
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [21] do
       * correspondente {infoCpCalc/tpCR}(./tpCR).
       *
       * @return Conteúdo do campo vrDescSeg
       */
      public Double getVrDescSeg() {
        return this.vrDescSeg;
      }

      /**
       * Valor efetivamente descontado do segurado, correspondente a
       * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) = [21] do
       * correspondente {infoCpCalc/tpCR}(./tpCR).
       *
       * @param vrDescSeg Valor para atribuir ao campo vrDescSeg
       * @return O próprio InfoCpCalc para continuar populando outros campos
       */
      public InfoCpCalc<T> setVrDescSeg(Double vrDescSeg) {
        this.vrDescSeg = vrDescSeg;
        return this;
      }

      public InfoCpCalc(Object pai) {
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
     * Informações sobre bases e valores das contribuições sociais
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "ideEstabLot",
        })
    public static class InfoCp<T> {

      /**
       * Identificação do estabelecimento ou obra e da lotação tributária
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       */
      private java.util.List<IdeEstabLot> ideEstabLot;

      /**
       * Identificação do estabelecimento ou obra e da lotação tributária
       *
       * @return Conteúdo do campo ideEstabLot
       */
      public java.util.List<IdeEstabLot> getIdeEstabLot() {
        return this.ideEstabLot;
      }

      /**
       * Identificação do estabelecimento ou obra e da lotação tributária
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       *
       * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento ou obra de construção civil e da
       * lotação tributária.
       *
       * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
       *
       * @return O objeto IdeEstabLot para população dos campos filhos
       */
      public IdeEstabLot<InfoCp<T>> setIdeEstabLot_Next() {
        if (this.ideEstabLot == null) {
          this.ideEstabLot = new java.util.ArrayList<>();
        }
        IdeEstabLot toAdd = new IdeEstabLot(this);
        this.ideEstabLot.add(toAdd);
        return toAdd;
      }

      public InfoCp(Object pai) {
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
       * Identificação do estabelecimento ou obra e da lotação tributária
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpInsc",
            "nrInsc",
            "codLotacao",
            "infoCategIncid",
          })
      public static class IdeEstabLot<T> {

        /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
        private String tpInsc;

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstabLot/tpInsc}(./tpInsc).
         */
        private String nrInsc;

        /** Informar o código atribuído pelo empregador para a lotação tributária. */
        private String codLotacao;

        /**
         * Informações relativas à matrícula e categoria do trabalhador e tipos de incidências.
         *
         * <p>- Esse campo pode ser repetido até 10 vezes
         */
        private java.util.List<InfoCategIncid> infoCategIncid;

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
         * <p>Evento de origem: S-1200, S-2299 ou S-2399.
         *
         * @param tpInsc Valor para atribuir ao campo tpInsc
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setTpInsc(String tpInsc) {
          if (!"1".equals(tpInsc)
              && !"2".equals(tpInsc)
              && !"3".equals(tpInsc)
              && !"4".equals(tpInsc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
          this.tpInsc = tpInsc;
          return this;
        }
        /**
         * CNPJ
         *
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setTpInsc_1() {
          this.tpInsc = "1";
          return this;
        }
        /**
         * CPF
         *
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setTpInsc_2() {
          this.tpInsc = "2";
          return this;
        }
        /**
         * CAEPF
         *
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setTpInsc_3() {
          this.tpInsc = "3";
          return this;
        }
        /**
         * CNO
         *
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setTpInsc_4() {
          this.tpInsc = "4";
          return this;
        }

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstabLot/tpInsc}(./tpInsc).
         *
         * @return Conteúdo do campo nrInsc
         */
        public String getNrInsc() {
          return this.nrInsc;
        }

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstabLot/tpInsc}(./tpInsc).
         *
         * <p>Evento de origem: S-1200, S-2299 ou S-2399.
         *
         * @param nrInsc Valor para atribuir ao campo nrInsc
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setNrInsc(String nrInsc) {
          this.nrInsc = nrInsc;
          return this;
        }

        /**
         * Informar o código atribuído pelo empregador para a lotação tributária.
         *
         * @return Conteúdo do campo codLotacao
         */
        public String getCodLotacao() {
          return this.codLotacao;
        }

        /**
         * Informar o código atribuído pelo empregador para a lotação tributária.
         *
         * <p>Evento de origem: S-1200, S-2299 ou S-2399.
         *
         * @param codLotacao Valor para atribuir ao campo codLotacao
         * @return O próprio IdeEstabLot para continuar populando outros campos
         */
        public IdeEstabLot<T> setCodLotacao(String codLotacao) {
          this.codLotacao = codLotacao;
          return this;
        }

        /**
         * Informações relativas à matrícula e categoria do trabalhador e tipos de incidências.
         *
         * @return Conteúdo do campo infoCategIncid
         */
        public java.util.List<InfoCategIncid> getInfoCategIncid() {
          return this.infoCategIncid;
        }

        /**
         * Informações relativas à matrícula e categoria do trabalhador e tipos de incidências.
         *
         * <p>- Esse campo pode ser repetido até 10 vezes
         *
         * <p>CHAVE_GRUPO: {matricula}, {codCateg}, {indSimples}
         *
         * @return O objeto InfoCategIncid para população dos campos filhos
         */
        public InfoCategIncid<IdeEstabLot<T>> setInfoCategIncid_Next() {
          if (this.infoCategIncid == null) {
            this.infoCategIncid = new java.util.ArrayList<>();
          }
          InfoCategIncid toAdd = new InfoCategIncid(this);
          this.infoCategIncid.add(toAdd);
          return toAdd;
        }

        public IdeEstabLot(Object pai) {
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
         * Informações relativas à matrícula e categoria do trabalhador e tipos de incidências.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "matricula",
              "codCateg",
              "indSimples",
              "infoBaseCS",
              "calcTerc",
              "infoPerRef",
            })
        public static class InfoCategIncid<T> {

          /**
           * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
           * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
           */
          private String matricula;

          /** Preencher com o código da categoria do trabalhador, conforme Tabela 01. */
          private Integer codCateg;

          /** Indicador de contribuição substituída. */
          private String indSimples;

          /**
           * Informações sobre bases de cálculo, descontos e deduções de CS
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           */
          private java.util.List<InfoBaseCS> infoBaseCS;

          /**
           * Cálculo das contribuições sociais devidas a Outras Entidades e Fundos.
           *
           * <p>- Esse campo pode ser repetido até 2 vezes
           */
          private java.util.List<CalcTerc> calcTerc;

          /**
           * Informações de remuneração por período de referência.
           *
           * <p>- Esse campo pode ser repetido indefinidas vezes
           */
          private java.util.List<InfoPerRef> infoPerRef;

          /**
           * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
           * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
           *
           * @return Conteúdo do campo matricula
           */
          public String getMatricula() {
            return this.matricula;
          }

          /**
           * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
           * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
           *
           * <p>Evento de origem: S-1200, S-2299 ou S-2399.
           *
           * @param matricula Valor para atribuir ao campo matricula
           * @return O próprio InfoCategIncid para continuar populando outros campos
           */
          public InfoCategIncid<T> setMatricula(String matricula) {
            this.matricula = matricula;
            return this;
          }

          /**
           * Preencher com o código da categoria do trabalhador, conforme Tabela 01.
           *
           * @return Conteúdo do campo codCateg
           */
          public Integer getCodCateg() {
            return this.codCateg;
          }

          /**
           * Preencher com o código da categoria do trabalhador, conforme Tabela 01.
           *
           * <p>Validação: Se o evento de origem for S-1200, retornar o código de categoria
           * informado nesse evento. Se o evento de origem for S-2299 ou S-2399, retornar o código
           * de categoria existente no Registro de Eventos Trabalhistas - RET.
           *
           * @param codCateg Valor para atribuir ao campo codCateg
           * @return O próprio InfoCategIncid para continuar populando outros campos
           */
          public InfoCategIncid<T> setCodCateg(Integer codCateg) {
            this.codCateg = codCateg;
            return this;
          }

          /**
           * Indicador de contribuição substituída.
           *
           * @return Conteúdo do campo indSimples
           */
          public String getIndSimples() {
            return this.indSimples;
          }

          /**
           * Indicador de contribuição substituída.
           *
           * <p>Evento de origem: S-1200, S-2299 ou S-2399.
           *
           * @param indSimples Valor para atribuir ao campo indSimples
           * @return O próprio InfoCategIncid para continuar populando outros campos
           */
          public InfoCategIncid<T> setIndSimples(String indSimples) {
            if (!"1".equals(indSimples) && !"2".equals(indSimples) && !"3".equals(indSimples))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indSimples) + " inválido para o campo indSimples");
            this.indSimples = indSimples;
            return this;
          }
          /**
           * Contribuição substituída integralmente
           *
           * @return O próprio InfoCategIncid para continuar populando outros campos
           */
          public InfoCategIncid<T> setIndSimples_1() {
            this.indSimples = "1";
            return this;
          }
          /**
           * Contribuição não substituída
           *
           * @return O próprio InfoCategIncid para continuar populando outros campos
           */
          public InfoCategIncid<T> setIndSimples_2() {
            this.indSimples = "2";
            return this;
          }
          /**
           * Contribuição não substituída concomitante com contribuição substituída
           *
           * @return O próprio InfoCategIncid para continuar populando outros campos
           */
          public InfoCategIncid<T> setIndSimples_3() {
            this.indSimples = "3";
            return this;
          }

          /**
           * Informações sobre bases de cálculo, descontos e deduções de CS
           *
           * @return Conteúdo do campo infoBaseCS
           */
          public java.util.List<InfoBaseCS> getInfoBaseCS() {
            return this.infoBaseCS;
          }

          /**
           * Informações sobre bases de cálculo, descontos e deduções de CS
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           *
           * <p>DESCRICAO_COMPLETA:Informações sobre bases de cálculo, descontos e deduções de
           * contribuições sociais devidas à Previdência Social e a Outras Entidades e Fundos.
           *
           * <p>Evento de origem: S-1200, S-2299 ou S-2399.
           *
           * <p>CHAVE_GRUPO: {ind13}, {tpValor}
           *
           * <p>CONDICAO_GRUPO: N (se
           * {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [10] e
           * {codCateg}(../codCateg) = [202]); O (nos demais casos)
           *
           * @return O objeto InfoBaseCS para população dos campos filhos
           */
          public InfoBaseCS<InfoCategIncid<T>> setInfoBaseCS_Next() {
            if (this.infoBaseCS == null) {
              this.infoBaseCS = new java.util.ArrayList<>();
            }
            InfoBaseCS toAdd = new InfoBaseCS(this);
            this.infoBaseCS.add(toAdd);
            return toAdd;
          }

          /**
           * Cálculo das contribuições sociais devidas a Outras Entidades e Fundos.
           *
           * @return Conteúdo do campo calcTerc
           */
          public java.util.List<CalcTerc> getCalcTerc() {
            return this.calcTerc;
          }

          /**
           * Cálculo das contribuições sociais devidas a Outras Entidades e Fundos.
           *
           * <p>- Esse campo pode ser repetido até 2 vezes
           *
           * <p>CHAVE_GRUPO: {tpCR}
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto CalcTerc para população dos campos filhos
           */
          public CalcTerc<InfoCategIncid<T>> setCalcTerc_Next() {
            if (this.calcTerc == null) {
              this.calcTerc = new java.util.ArrayList<>();
            }
            CalcTerc toAdd = new CalcTerc(this);
            this.calcTerc.add(toAdd);
            return toAdd;
          }

          /**
           * Informações de remuneração por período de referência.
           *
           * @return Conteúdo do campo infoPerRef
           */
          public java.util.List<InfoPerRef> getInfoPerRef() {
            return this.infoPerRef;
          }

          /**
           * Informações de remuneração por período de referência.
           *
           * <p>- Esse campo pode ser repetido indefinidas vezes
           *
           * <p>CHAVE_GRUPO: {perRef}
           *
           * @return O objeto InfoPerRef para população dos campos filhos
           */
          public InfoPerRef<InfoCategIncid<T>> setInfoPerRef_Next() {
            if (this.infoPerRef == null) {
              this.infoPerRef = new java.util.ArrayList<>();
            }
            InfoPerRef toAdd = new InfoPerRef(this);
            this.infoPerRef.add(toAdd);
            return toAdd;
          }

          public InfoCategIncid(Object pai) {
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
           * Informações sobre bases de cálculo, descontos e deduções de CS
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "ind13", "tpValor", "valor",
              })
          public static class InfoBaseCS<T> {

            /** Indicativo de 13° salário. */
            private String ind13;

            /** Tipo de valor que influi na apuração da contribuição devida. */
            private String tpValor;

            /**
             * Valor da base de cálculo, dedução ou desconto da contribuição social devida à
             * Previdência Social ou a Outras Entidades e Fundos, conforme definido no campo
             * {tpValor}(./tpValor).
             */
            private Double valor;

            /**
             * Indicativo de 13° salário.
             *
             * @return Conteúdo do campo ind13
             */
            public String getInd13() {
              return this.ind13;
            }

            /**
             * Indicativo de 13° salário.
             *
             * <p>Validação: Se {indApuracao}(/ideEvento_perApur) = [2], preencher com [1].
             *
             * @param ind13 Valor para atribuir ao campo ind13
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setInd13(String ind13) {
              if (!"0".equals(ind13) && !"1".equals(ind13))
                throw new RuntimeException(
                    "Valor " + String.valueOf(ind13) + " inválido para o campo ind13");
              this.ind13 = ind13;
              return this;
            }
            /**
             * Mensal
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setInd13_0() {
              this.ind13 = "0";
              return this;
            }
            /**
             * 13° salário ({codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 =
             * [12, 14, 16, 22, 26, 32, 92, 94, 96, 98])
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setInd13_1() {
              this.ind13 = "1";
              return this;
            }

            /**
             * Tipo de valor que influi na apuração da contribuição devida.
             *
             * @return Conteúdo do campo tpValor
             */
            public String getTpValor() {
              return this.tpValor;
            }

            /**
             * Tipo de valor que influi na apuração da contribuição devida.
             *
             * @param tpValor Valor para atribuir ao campo tpValor
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor(String tpValor) {
              if (!"11".equals(tpValor)
                  && !"12".equals(tpValor)
                  && !"13".equals(tpValor)
                  && !"14".equals(tpValor)
                  && !"15".equals(tpValor)
                  && !"16".equals(tpValor)
                  && !"17".equals(tpValor)
                  && !"18".equals(tpValor)
                  && !"19".equals(tpValor)
                  && !"21".equals(tpValor)
                  && !"22".equals(tpValor)
                  && !"23".equals(tpValor)
                  && !"31".equals(tpValor)
                  && !"32".equals(tpValor)
                  && !"41".equals(tpValor)
                  && !"42".equals(tpValor)
                  && !"43".equals(tpValor)
                  && !"44".equals(tpValor)
                  && !"45".equals(tpValor)
                  && !"46".equals(tpValor)
                  && !"47".equals(tpValor)
                  && !"48".equals(tpValor)
                  && !"49".equals(tpValor)
                  && !"81".equals(tpValor)
                  && !"82".equals(tpValor)
                  && !"83".equals(tpValor)
                  && !"84".equals(tpValor)
                  && !"85".equals(tpValor)
                  && !"86".equals(tpValor)
                  && !"87".equals(tpValor)
                  && !"88".equals(tpValor)
                  && !"91".equals(tpValor)
                  && !"92".equals(tpValor)
                  && !"93".equals(tpValor)
                  && !"94".equals(tpValor)
                  && !"95".equals(tpValor)
                  && !"96".equals(tpValor)
                  && !"97".equals(tpValor)
                  && !"98".equals(tpValor))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpValor) + " inválido para o campo tpValor");
              this.tpValor = tpValor;
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária normal
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_11() {
              this.tpValor = "11";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_12() {
              this.tpValor = "12";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_13() {
              this.tpValor = "13";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_14() {
              this.tpValor = "14";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional normal - Exclusiva do
             * empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_15() {
              this.tpValor = "15";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição - Exclusiva do
             * empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_16() {
              this.tpValor = "16";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição - Exclusiva do
             * empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_17() {
              this.tpValor = "17";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição - Exclusiva do
             * empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_18() {
              this.tpValor = "18";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária exclusiva do empregado
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_19() {
              this.tpValor = "19";
              return this;
            }
            /**
             * Valor total descontado do trabalhador para recolhimento à Previdência Social
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_21() {
              this.tpValor = "21";
              return this;
            }
            /**
             * Valor descontado do trabalhador para recolhimento ao SEST
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_22() {
              this.tpValor = "22";
              return this;
            }
            /**
             * Valor descontado do trabalhador para recolhimento ao SENAT
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_23() {
              this.tpValor = "23";
              return this;
            }
            /**
             * Valor pago ao trabalhador a título de salário-família
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_31() {
              this.tpValor = "31";
              return this;
            }
            /**
             * Valor pago ao trabalhador a título de salário-maternidade
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_32() {
              this.tpValor = "32";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária normal - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_41() {
              this.tpValor = "41";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição - Categorias 107 e
             * 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_42() {
              this.tpValor = "42";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição - Categorias 107 e
             * 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_43() {
              this.tpValor = "43";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição - Categorias 107 e
             * 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_44() {
              this.tpValor = "44";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional normal - Exclusiva do
             * empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_45() {
              this.tpValor = "45";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição - Exclusiva do
             * empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_46() {
              this.tpValor = "46";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição - Exclusiva do
             * empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_47() {
              this.tpValor = "47";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição - Exclusiva do
             * empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_48() {
              this.tpValor = "48";
              return this;
            }
            /**
             * Base de cálculo da contribuição previdenciária exclusiva do empregado - Categorias
             * 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_49() {
              this.tpValor = "49";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - Base de cálculo - BC da
             * Contribuição Previdenciária - CP normal - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_81() {
              this.tpValor = "81";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 15 anos de trabalho - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_82() {
              this.tpValor = "82";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 20 anos de trabalho - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_83() {
              this.tpValor = "83";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 25 anos de trabalho - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_84() {
              this.tpValor = "84";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP normal - Exclusiva do
             * empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_85() {
              this.tpValor = "85";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 15 anos de trabalho - Exclusiva do empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_86() {
              this.tpValor = "86";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 20 anos de trabalho - Exclusiva do empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_87() {
              this.tpValor = "87";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 25 anos de trabalho - Exclusiva do empregador - Categorias 107 e 108
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_88() {
              this.tpValor = "88";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP normal
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_91() {
              this.tpValor = "91";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 15 anos de trabalho
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_92() {
              this.tpValor = "92";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 20 anos de trabalho
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_93() {
              this.tpValor = "93";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 25 anos de trabalho
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_94() {
              this.tpValor = "94";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP normal - Exclusiva do
             * empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_95() {
              this.tpValor = "95";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 15 anos de trabalho - Exclusiva do empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_96() {
              this.tpValor = "96";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 20 anos de trabalho - Exclusiva do empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_97() {
              this.tpValor = "97";
              return this;
            }
            /**
             * Incidência suspensa em decorrência de decisão judicial - BC CP aposentadoria especial
             * aos 25 anos de trabalho - Exclusiva do empregador
             *
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setTpValor_98() {
              this.tpValor = "98";
              return this;
            }

            /**
             * Valor da base de cálculo, dedução ou desconto da contribuição social devida à
             * Previdência Social ou a Outras Entidades e Fundos, conforme definido no campo
             * {tpValor}(./tpValor).
             *
             * @return Conteúdo do campo valor
             */
            public Double getValor() {
              return this.valor;
            }

            /**
             * Valor da base de cálculo, dedução ou desconto da contribuição social devida à
             * Previdência Social ou a Outras Entidades e Fundos, conforme definido no campo
             * {tpValor}(./tpValor).
             *
             * <p>Validação: Deve ser maior que 0 (zero).
             *
             * <p>Deve corresponder ao somatório dos valores informados no campo {vrRubr} em S-1200
             * e S-2299 (grupos {infoPerApur} e {infoPerAnt}), e também em S-2399, obedecendo ao que
             * segue:
             *
             * <p>a) Somar os valores das rubricas cujo
             * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [1, 3]
             * e subtrair os valores das rubricas cujo
             * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [2,
             * 4], observando a tabela de relacionamento abaixo:
             *
             * <p>{tpValor}(./tpValor) = [11]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e ({grauExp} em S-1200/S-2299 = [1] ou não informado);
             *
             * <p>{tpValor}(./tpValor) = [12]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e {grauExp} em S-1200/S-2299 = [2];
             *
             * <p>{tpValor}(./tpValor) = [13]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e {grauExp} em S-1200/S-2299 = [3];
             *
             * <p>{tpValor}(./tpValor) = [14]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e {grauExp} em S-1200/S-2299 = [4];
             *
             * <p>{tpValor}(./tpValor) = [15]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14, 25,
             * 26] e ({grauExp} em S-1200/S-2299 = [1] ou não informado);
             *
             * <p>{tpValor}(./tpValor) = [16]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
             * {grauExp} em S-1200/S-2299 = [2];
             *
             * <p>{tpValor}(./tpValor) = [17]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
             * {grauExp} em S-1200/S-2299 = [3];
             *
             * <p>{tpValor}(./tpValor) = [18]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
             * {grauExp} em S-1200/S-2299 = [4];
             *
             * <p>{tpValor}(./tpValor) = [19],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [15, 16];
             *
             * <p>{tpValor}(./tpValor) = [31],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [51];
             *
             * <p>{tpValor}(./tpValor) = [32],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [21, 22] ou
             * ({natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 = [4050, 4051]
             * com {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [9X]);
             *
             * <p>{tpValor}(./tpValor) = [41]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e ({grauExp} em S-1200/S-2299 = [1] ou não informado), observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [42]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e {grauExp} em S-1200/S-2299 = [2], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [43]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e {grauExp} em S-1200/S-2299 = [3], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [44]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12, 21,
             * 22] e {grauExp} em S-1200/S-2299 = [4], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [45]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14, 25,
             * 26] e ({grauExp} em S-1200/S-2299 = [1] ou não informado), observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [46]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
             * {grauExp} em S-1200/S-2299 = [2], observado o limite para {codCateg}(../codCateg) =
             * [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [47]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
             * {grauExp} em S-1200/S-2299 = [3], observado o limite para {codCateg}(../codCateg) =
             * [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [48]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
             * {grauExp} em S-1200/S-2299 = [4], observado o limite para {codCateg}(../codCateg) =
             * [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [49],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [15, 16],
             * observado o limite para {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [81]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e ({grauExp} em S-1200/S-2299 = [1] ou não informado), observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [82]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e {grauExp} em S-1200/S-2299 = [2], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [83]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e {grauExp} em S-1200/S-2299 = [3], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [84]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e {grauExp} em S-1200/S-2299 = [4], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [85]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e ({grauExp} em S-1200/S-2299 = [1] ou não informado), observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [86]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e {grauExp} em S-1200/S-2299 = [2], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [87]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e {grauExp} em S-1200/S-2299 = [3], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [88]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e {grauExp} em S-1200/S-2299 = [4], observado o limite para
             * {codCateg}(../codCateg) = [107, 108];
             *
             * <p>{tpValor}(./tpValor) = [91]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e ({grauExp} em S-1200/S-2299 = [1] ou não informado);
             *
             * <p>{tpValor}(./tpValor) = [92]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e {grauExp} em S-1200/S-2299 = [2];
             *
             * <p>{tpValor}(./tpValor) = [93]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e {grauExp} em S-1200/S-2299 = [3];
             *
             * <p>{tpValor}(./tpValor) = [94]*,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [91, 92, 93,
             * 94] e {grauExp} em S-1200/S-2299 = [4];
             *
             * <p>{tpValor}(./tpValor) = [95]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e ({grauExp} em S-1200/S-2299 = [1] ou não informado);
             *
             * <p>{tpValor}(./tpValor) = [96]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e {grauExp} em S-1200/S-2299 = [2];
             *
             * <p>{tpValor}(./tpValor) = [97]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e {grauExp} em S-1200/S-2299 = [3];
             *
             * <p>{tpValor}(./tpValor) = [98]**,
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [95, 96, 97,
             * 98] e {grauExp} em S-1200/S-2299 = [4].
             *
             * <p>
             *
             * <p>b) Somar os valores das rubricas cujo
             * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [2, 4]
             * e subtrair os valores das rubricas cujo
             * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [1,
             * 3], observando a tabela de relacionamento abaixo:
             *
             * <p>{tpValor}(./tpValor) = [21],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [31, 32];
             *
             * <p>{tpValor}(./tpValor) = [22],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [34];
             *
             * <p>{tpValor}(./tpValor) = [23],
             * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [35].
             *
             * <p>
             *
             * <p>* Caso {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) da rubrica em
             * S-1010 seja igual a [91, 92, 93, 94] e
             * {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) do respectivo
             * processo em S-1070 seja diferente de [90] (decisão definitiva), o valor também deve
             * ser computado na composição das bases do {tpValor}(./tpValor) = [11, 12, 13, 14, 41,
             * 42, 43, 44].
             *
             * <p>Se {codCateg}(../codCateg) = [107, 108], caso {tpValor}(./tpValor) = [11] seja
             * maior que o limite do salário-base para essas categorias, então {tpValor}(./tpValor)
             * = [81] é igual a {tpValor}=[41] – ({tpValor}=[11] – {tpValor}=[91]). Se
             * {tpValor}(./tpValor) = [81] resultar negativo, informar 0 (zero). O mesmo se aplica
             * para {tpValor}(./tpValor) = [82, 83, 84].
             *
             * <p>** Caso {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) da rubrica em
             * S-1010 seja igual a [95, 96, 97, 98] e
             * {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) do respectivo
             * processo em S-1070 seja diferente de [90] (decisão definitiva), o valor também deve
             * ser computado na composição das bases do {tpValor}(./tpValor) = [15, 16, 17, 18, 45,
             * 46, 47, 48].
             *
             * <p>Se {codCateg}(../codCateg) = [107, 108], caso {tpValor}(./tpValor) = [15] seja
             * maior que o limite do salário-base para essas categorias, então {tpValor}(./tpValor)
             * = [85] é igual a {tpValor}=[45] – ({tpValor}=[15] – {tpValor}=[95]). Se
             * {tpValor}(./tpValor) = [85] resultar negativo, informar 0 (zero). O mesmo se aplica
             * para {tpValor}(./tpValor) = [86, 87, 88].
             *
             * <p>*** Caso {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) do
             * respectivo processo em S-1070 seja igual a [90] (decisão definitiva), o valor não
             * deve ser computado.
             *
             * @param valor Valor para atribuir ao campo valor
             * @return O próprio InfoBaseCS para continuar populando outros campos
             */
            public InfoBaseCS<T> setValor(Double valor) {
              this.valor = valor;
              return this;
            }

            public InfoBaseCS(Object pai) {
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
           * Cálculo das contribuições sociais devidas a Outras Entidades e Fundos.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpCR",
                "vrCsSegTerc",
                "vrDescTerc",
              })
          public static class CalcTerc<T> {

            /** Código de Receita - CR da contribuição descontada do trabalhador. */
            private Integer tpCR;

            /**
             * Valor da contribuição social devida a Outras Entidades ou Fundos, calculada segundo a
             * legislação em vigor, por CR.
             */
            private Double vrCsSegTerc;

            /**
             * Valor efetivamente descontado do segurado, correspondente a
             * {tpValor}(../infoBaseCS_tpValor) = [22, 23], do correspondente
             * {calcTerc/tpCR}(./tpCR).
             */
            private Double vrDescTerc;

            /**
             * Código de Receita - CR da contribuição descontada do trabalhador.
             *
             * @return Conteúdo do campo tpCR
             */
            public Integer getTpCR() {
              return this.tpCR;
            }

            /**
             * Código de Receita - CR da contribuição descontada do trabalhador.
             *
             * @param tpCR Valor para atribuir ao campo tpCR
             * @return O próprio CalcTerc para continuar populando outros campos
             */
            public CalcTerc<T> setTpCR(Integer tpCR) {
              if (!"121802".equals(tpCR) && !"122102".equals(tpCR))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpCR) + " inválido para o campo tpCR");
              this.tpCR = tpCR;
              return this;
            }
            /**
             * Contribuição ao SEST, descontada do transportador autônomo
             *
             * @return O próprio CalcTerc para continuar populando outros campos
             */
            public CalcTerc<T> setTpCR_121802() {
              this.tpCR = "121802";
              return this;
            }
            /**
             * Contribuição ao SENAT, descontada do transportador autônomo
             *
             * @return O próprio CalcTerc para continuar populando outros campos
             */
            public CalcTerc<T> setTpCR_122102() {
              this.tpCR = "122102";
              return this;
            }

            /**
             * Valor da contribuição social devida a Outras Entidades ou Fundos, calculada segundo a
             * legislação em vigor, por CR.
             *
             * @return Conteúdo do campo vrCsSegTerc
             */
            public Double getVrCsSegTerc() {
              return this.vrCsSegTerc;
            }

            /**
             * Valor da contribuição social devida a Outras Entidades ou Fundos, calculada segundo a
             * legislação em vigor, por CR.
             *
             * <p>Validação: {calcTerc/tpCR}(./tpCR) = [121802] - Somatório de
             * {valor}(../infoBaseCS_valor) quando {tpValor}(../infoBaseCS_tpValor) = [11, 12, 13,
             * 14], multiplicado pela alíquota de 1,5%, se {codCateg}(../codCateg) = [711, 712, 734]
             * (transportador autônomo);
             *
             * <p>{calcTerc/tpCR}(./tpCR) = [122102] - Somatório de {valor}(../infoBaseCS_valor)
             * quando {tpValor}(../infoBaseCS_tpValor) = [11, 12, 13, 14], multiplicado pela
             * alíquota de 1,0%, se {codCateg}(../codCateg) = [711, 712, 734] (transportador
             * autônomo).
             *
             * <p>OBS.: No período de 04/2020 a 06/2020, as alíquotas devem ser 0,75% para o SEST e
             * 0,5% para o SENAT.
             *
             * @param vrCsSegTerc Valor para atribuir ao campo vrCsSegTerc
             * @return O próprio CalcTerc para continuar populando outros campos
             */
            public CalcTerc<T> setVrCsSegTerc(Double vrCsSegTerc) {
              this.vrCsSegTerc = vrCsSegTerc;
              return this;
            }

            /**
             * Valor efetivamente descontado do segurado, correspondente a
             * {tpValor}(../infoBaseCS_tpValor) = [22, 23], do correspondente
             * {calcTerc/tpCR}(./tpCR).
             *
             * @return Conteúdo do campo vrDescTerc
             */
            public Double getVrDescTerc() {
              return this.vrDescTerc;
            }

            /**
             * Valor efetivamente descontado do segurado, correspondente a
             * {tpValor}(../infoBaseCS_tpValor) = [22, 23], do correspondente
             * {calcTerc/tpCR}(./tpCR).
             *
             * @param vrDescTerc Valor para atribuir ao campo vrDescTerc
             * @return O próprio CalcTerc para continuar populando outros campos
             */
            public CalcTerc<T> setVrDescTerc(Double vrDescTerc) {
              this.vrDescTerc = vrDescTerc;
              return this;
            }

            public CalcTerc(Object pai) {
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
           * Informações de remuneração por período de referência.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "perRef",
                "ideADC",
                "detInfoPerRef",
              })
          public static class InfoPerRef<T> {

            /** Informar o período ao qual se refere a remuneração. */
            private String perRef;

            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * <p>- Esse campo pode ser repetido indefinidas vezes
             */
            private java.util.List<IdeADC> ideADC;

            /**
             * Detalhamento das informações de remuneração por período de referência
             *
             * <p>- Esse campo pode ser repetido até 99 vezes
             */
            private java.util.List<DetInfoPerRef> detInfoPerRef;

            /**
             * Informar o período ao qual se refere a remuneração.
             *
             * @return Conteúdo do campo perRef
             */
            public String getPerRef() {
              return this.perRef;
            }

            /**
             * Informar o período ao qual se refere a remuneração.
             *
             * <p>Origem: {perApur}(5001_ideEvento_perApur) ou campo {perRef} de S-1200/S-2299.
             *
             * @param perRef Valor para atribuir ao campo perRef
             * @return O próprio InfoPerRef para continuar populando outros campos
             */
            public InfoPerRef<T> setPerRef(String perRef) {
              this.perRef = perRef;
              return this;
            }

            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * @return Conteúdo do campo ideADC
             */
            public java.util.List<IdeADC> getIdeADC() {
              return this.ideADC;
            }

            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * <p>- Esse campo pode ser repetido indefinidas vezes
             *
             * <p>DESCRICAO_COMPLETA:Identificação do instrumento ou situação ensejadora da
             * remuneração relativa a períodos de apuração anteriores.
             *
             * <p>Evento de origem: S-1200 ou S-2299 (exceto {remunSuc}(./remunSuc), cujo evento de
             * origem somente é S-1200).
             *
             * <p>CHAVE_GRUPO: {dtAcConv}, {tpAcConv}
             *
             * <p>CONDICAO_GRUPO: OC
             *
             * @return O objeto IdeADC para população dos campos filhos
             */
            public IdeADC<InfoPerRef<T>> setIdeADC_Next() {
              if (this.ideADC == null) {
                this.ideADC = new java.util.ArrayList<>();
              }
              IdeADC toAdd = new IdeADC(this);
              this.ideADC.add(toAdd);
              return toAdd;
            }

            /**
             * Detalhamento das informações de remuneração por período de referência
             *
             * @return Conteúdo do campo detInfoPerRef
             */
            public java.util.List<DetInfoPerRef> getDetInfoPerRef() {
              return this.detInfoPerRef;
            }

            /**
             * Detalhamento das informações de remuneração por período de referência
             *
             * <p>- Esse campo pode ser repetido até 99 vezes
             *
             * <p>DESCRICAO_COMPLETA:Detalhamento das informações de remuneração por período de
             * referência. Deve ser preenchido com informações de {infoPerApur} e {infoPerAnt} do
             * S-1200 e S-2299, e de {dmDev} do S-2399, quando houver.
             *
             * <p>CHAVE_GRUPO: {ind13}, {tpVrPerRef}
             *
             * @return O objeto DetInfoPerRef para população dos campos filhos
             */
            public DetInfoPerRef<InfoPerRef<T>> setDetInfoPerRef_Next() {
              if (this.detInfoPerRef == null) {
                this.detInfoPerRef = new java.util.ArrayList<>();
              }
              DetInfoPerRef toAdd = new DetInfoPerRef(this);
              this.detInfoPerRef.add(toAdd);
              return toAdd;
            }

            public InfoPerRef(Object pai) {
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
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "dtAcConv",
                  "tpAcConv",
                  "dsc",
                  "remunSuc",
                })
            public static class IdeADC<T> {

              /**
               * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da
               * conversão da licença saúde em acidente de trabalho.
               */
              private javax.xml.datatype.XMLGregorianCalendar dtAcConv;

              /**
               * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
               * apuração anteriores.
               */
              private String tpAcConv;

              /**
               * Descrição do instrumento ou situação que originou o pagamento das verbas relativas
               * a períodos anteriores.
               */
              private String dsc;

              /**
               * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
               * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
               */
              private String remunSuc;

              /**
               * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da
               * conversão da licença saúde em acidente de trabalho.
               *
               * @return Conteúdo do campo dtAcConv
               */
              public javax.xml.datatype.XMLGregorianCalendar getDtAcConv() {
                return this.dtAcConv;
              }

              /**
               * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da
               * conversão da licença saúde em acidente de trabalho.
               *
               * @param dtAcConv Valor para atribuir ao campo dtAcConv
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setDtAcConv(javax.xml.datatype.XMLGregorianCalendar dtAcConv) {
                this.dtAcConv = dtAcConv;
                return this;
              }

              /**
               * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
               * apuração anteriores.
               *
               * @return Conteúdo do campo tpAcConv
               */
              public String getTpAcConv() {
                return this.tpAcConv;
              }

              /**
               * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
               * apuração anteriores.
               *
               * @param tpAcConv Valor para atribuir ao campo tpAcConv
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv(String tpAcConv) {
                if (!"A".equals(tpAcConv)
                    && !"B".equals(tpAcConv)
                    && !"C".equals(tpAcConv)
                    && !"D".equals(tpAcConv)
                    && !"E".equals(tpAcConv)
                    && !"F".equals(tpAcConv)
                    && !"G".equals(tpAcConv))
                  throw new RuntimeException(
                      "Valor " + String.valueOf(tpAcConv) + " inválido para o campo tpAcConv");
                this.tpAcConv = tpAcConv;
                return this;
              }
              /**
               * Acordo Coletivo de Trabalho
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_A() {
                this.tpAcConv = "A";
                return this;
              }
              /**
               * Legislação federal, estadual, municipal ou distrital
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_B() {
                this.tpAcConv = "B";
                return this;
              }
              /**
               * Convenção Coletiva de Trabalho
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_C() {
                this.tpAcConv = "C";
                return this;
              }
              /**
               * Sentença normativa - Dissídio
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_D() {
                this.tpAcConv = "D";
                return this;
              }
              /**
               * Conversão de licença saúde em acidente de trabalho
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_E() {
                this.tpAcConv = "E";
                return this;
              }
              /**
               * Outras verbas de natureza salarial ou não salarial devidas após o desligamento
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_F() {
                this.tpAcConv = "F";
                return this;
              }
              /**
               * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_G() {
                this.tpAcConv = "G";
                return this;
              }

              /**
               * Descrição do instrumento ou situação que originou o pagamento das verbas relativas
               * a períodos anteriores.
               *
               * @return Conteúdo do campo dsc
               */
              public String getDsc() {
                return this.dsc;
              }

              /**
               * Descrição do instrumento ou situação que originou o pagamento das verbas relativas
               * a períodos anteriores.
               *
               * @param dsc Valor para atribuir ao campo dsc
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setDsc(String dsc) {
                this.dsc = dsc;
                return this;
              }

              /**
               * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
               * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
               *
               * @return Conteúdo do campo remunSuc
               */
              public String getRemunSuc() {
                return this.remunSuc;
              }

              /**
               * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
               * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
               *
               * @param remunSuc Valor para atribuir ao campo remunSuc
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setRemunSuc(String remunSuc) {
                if (!"S".equals(remunSuc) && !"N".equals(remunSuc))
                  throw new RuntimeException(
                      "Valor " + String.valueOf(remunSuc) + " inválido para o campo remunSuc");
                this.remunSuc = remunSuc;
                return this;
              }
              /**
               * Sim
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setRemunSuc_S() {
                this.remunSuc = "S";
                return this;
              }
              /**
               * Não
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setRemunSuc_N() {
                this.remunSuc = "N";
                return this;
              }

              public IdeADC(Object pai) {
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
             * Detalhamento das informações de remuneração por período de referência
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "ind13",
                  "tpVrPerRef",
                  "vrPerRef",
                })
            public static class DetInfoPerRef<T> {

              /** Indicativo de 13° salário. */
              private String ind13;

              /** Tipo de valor que influi na apuração da contribuição devida. */
              private String tpVrPerRef;

              /**
               * Valor da base de cálculo, dedução ou desconto da contribuição social, conforme
               * definido no campo {tpVrPerRef}(./tpVrPerRef).
               */
              private Double vrPerRef;

              /**
               * Indicativo de 13° salário.
               *
               * @return Conteúdo do campo ind13
               */
              public String getInd13() {
                return this.ind13;
              }

              /**
               * Indicativo de 13° salário.
               *
               * <p>Validação: Se {indApuracao}(/ideEvento_perApur) = [2], preencher com [1].
               *
               * @param ind13 Valor para atribuir ao campo ind13
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setInd13(String ind13) {
                if (!"0".equals(ind13) && !"1".equals(ind13))
                  throw new RuntimeException(
                      "Valor " + String.valueOf(ind13) + " inválido para o campo ind13");
                this.ind13 = ind13;
                return this;
              }
              /**
               * Mensal
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setInd13_0() {
                this.ind13 = "0";
                return this;
              }
              /**
               * 13° salário ({codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010
               * = [12, 14, 16, 22, 26, 32, 92, 94, 96, 98])
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setInd13_1() {
                this.ind13 = "1";
                return this;
              }

              /**
               * Tipo de valor que influi na apuração da contribuição devida.
               *
               * @return Conteúdo do campo tpVrPerRef
               */
              public String getTpVrPerRef() {
                return this.tpVrPerRef;
              }

              /**
               * Tipo de valor que influi na apuração da contribuição devida.
               *
               * @param tpVrPerRef Valor para atribuir ao campo tpVrPerRef
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef(String tpVrPerRef) {
                if (!"11".equals(tpVrPerRef)
                    && !"12".equals(tpVrPerRef)
                    && !"13".equals(tpVrPerRef)
                    && !"14".equals(tpVrPerRef)
                    && !"15".equals(tpVrPerRef)
                    && !"16".equals(tpVrPerRef)
                    && !"17".equals(tpVrPerRef)
                    && !"18".equals(tpVrPerRef)
                    && !"19".equals(tpVrPerRef)
                    && !"21".equals(tpVrPerRef)
                    && !"22".equals(tpVrPerRef)
                    && !"23".equals(tpVrPerRef)
                    && !"31".equals(tpVrPerRef)
                    && !"32".equals(tpVrPerRef))
                  throw new RuntimeException(
                      "Valor " + String.valueOf(tpVrPerRef) + " inválido para o campo tpVrPerRef");
                this.tpVrPerRef = tpVrPerRef;
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária normal
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_11() {
                this.tpVrPerRef = "11";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_12() {
                this.tpVrPerRef = "12";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_13() {
                this.tpVrPerRef = "13";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_14() {
                this.tpVrPerRef = "14";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional normal - Exclusiva do
               * empregador
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_15() {
                this.tpVrPerRef = "15";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição - Exclusiva do
               * empregador
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_16() {
                this.tpVrPerRef = "16";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição - Exclusiva do
               * empregador
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_17() {
                this.tpVrPerRef = "17";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição - Exclusiva do
               * empregador
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_18() {
                this.tpVrPerRef = "18";
                return this;
              }
              /**
               * Base de cálculo da contribuição previdenciária exclusiva do empregado
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_19() {
                this.tpVrPerRef = "19";
                return this;
              }
              /**
               * Valor total descontado do trabalhador para recolhimento à Previdência Social
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_21() {
                this.tpVrPerRef = "21";
                return this;
              }
              /**
               * Valor descontado do trabalhador para recolhimento ao SEST
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_22() {
                this.tpVrPerRef = "22";
                return this;
              }
              /**
               * Valor descontado do trabalhador para recolhimento ao SENAT
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_23() {
                this.tpVrPerRef = "23";
                return this;
              }
              /**
               * Valor pago ao trabalhador a título de salário-família
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_31() {
                this.tpVrPerRef = "31";
                return this;
              }
              /**
               * Valor pago ao trabalhador a título de salário-maternidade
               *
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setTpVrPerRef_32() {
                this.tpVrPerRef = "32";
                return this;
              }

              /**
               * Valor da base de cálculo, dedução ou desconto da contribuição social, conforme
               * definido no campo {tpVrPerRef}(./tpVrPerRef).
               *
               * @return Conteúdo do campo vrPerRef
               */
              public Double getVrPerRef() {
                return this.vrPerRef;
              }

              /**
               * Valor da base de cálculo, dedução ou desconto da contribuição social, conforme
               * definido no campo {tpVrPerRef}(./tpVrPerRef).
               *
               * <p>Validação: Deve ser maior que 0 (zero).
               *
               * <p>Deve corresponder ao somatório dos valores informados no campo {vrRubr} em
               * S-1200 e S-2299 (grupos {infoPerApur} e {infoPerAnt}), e também em S-2399,
               * obedecendo ao que segue:
               *
               * <p>a) Somar os valores das rubricas cujo
               * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [1,
               * 3] e subtrair os valores das rubricas cujo
               * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [2,
               * 4], observando a tabela de relacionamento abaixo:
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [11]*,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12,
               * 21, 22] e ({grauExp} em S-1200/S-2299 = [1] ou não informado);
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [12]*,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12,
               * 21, 22] e {grauExp} em S-1200/S-2299 = [2];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [13]*,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12,
               * 21, 22] e {grauExp} em S-1200/S-2299 = [3];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [14]*,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [11, 12,
               * 21, 22] e {grauExp} em S-1200/S-2299 = [4];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [15]**,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14,
               * 25, 26] e ({grauExp} em S-1200/S-2299 = [1] ou não informado);
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [16]**,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
               * {grauExp} em S-1200/S-2299 = [2];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [17]**,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
               * {grauExp} em S-1200/S-2299 = [3];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [18]**,
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [13, 14] e
               * {grauExp} em S-1200/S-2299 = [4];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [19],
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [15, 16];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [31],
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [51];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [32],
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [21, 22] ou
               * ({natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 = [4050, 4051]
               * com {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [9X]).
               *
               * <p>
               *
               * <p>b) Somar os valores das rubricas cujo
               * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [2,
               * 4] e subtrair os valores das rubricas cujo
               * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a [1,
               * 3], observando a tabela de relacionamento abaixo:
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [21],
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [31, 32];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [22],
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [34];
               *
               * <p>{tpVrPerRef}(./tpVrPerRef) = [23],
               * {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 = [35].
               *
               * <p>
               *
               * <p>* Caso {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) da rubrica em
               * S-1010 seja igual a [91, 92, 93, 94] e
               * {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) do respectivo
               * processo em S-1070 seja diferente de [90] (decisão definitiva), o valor deve ser
               * computado na composição das bases do {tpVrPerRef}(./tpVrPerRef) = [11, 12, 13, 14].
               *
               * <p>** Caso {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) da rubrica
               * em S-1010 seja igual a [95, 96, 97, 98] e
               * {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) do respectivo
               * processo em S-1070 seja diferente de [90] (decisão definitiva), o valor deve ser
               * computado na composição das bases do {tpVrPerRef}(./tpVrPerRef) = [15, 16, 17, 18].
               *
               * <p>*** Caso {indSusp}(1070_infoProcesso_inclusao_dadosProc_infoSusp_indSusp) do
               * respectivo processo em S-1070 seja igual a [90] (decisão definitiva), o valor não
               * deve ser computado.
               *
               * @param vrPerRef Valor para atribuir ao campo vrPerRef
               * @return O próprio DetInfoPerRef para continuar populando outros campos
               */
              public DetInfoPerRef<T> setVrPerRef(Double vrPerRef) {
                this.vrPerRef = vrPerRef;
                return this;
              }

              public DetInfoPerRef(Object pai) {
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
  }
}
