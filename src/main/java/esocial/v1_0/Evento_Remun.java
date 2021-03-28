package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1200 - Remuneração de Trabalhador vinculado ao Regime Geral de Previd. Social */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtRemun",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Remun {

  /** Evento Remuneração de Trabalhador vinculado ao RGPS */
  private EvtRemun evtRemun;

  /**
   * Evento Remuneração de Trabalhador vinculado ao RGPS
   *
   * @return Conteúdo do campo evtRemun
   */
  public EvtRemun getEvtRemun() {
    return this.evtRemun;
  }

  /**
   * Evento Remuneração de Trabalhador vinculado ao RGPS
   *
   * <p>DESCRICAO_COMPLETA:Evento Remuneração de Trabalhador vinculado ao Regime Geral de
   * Previdência Social.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_BLOQUEIA_USO_CPF_EMPREGADOR
   *
   * <p>REGRA:REGRA_COMPATIBILIDADE_CATEGORIA_CLASSTRIB
   *
   * <p>REGRA:REGRA_COMPATIB_REGIME_PREV
   *
   * <p>REGRA:REGRA_CONTROLE_DUPLICIDADE
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_REMUN_ANUAL_DEZEMBRO
   *
   * <p>REGRA:REGRA_REMUN_CATEG_COMPATIVEL_TPLOTACAO
   *
   * <p>REGRA:REGRA_REMUN_CATEG_EXISTENTE_RET
   *
   * <p>REGRA:REGRA_REMUN_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_REMUN_JA_EXISTE_DESLIGAMENTO
   *
   * <p>REGRA:REGRA_REMUN_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_REMUN_TRAB_EXISTENTE_RET
   *
   * <p>REGRA:REGRA_REMUN_VALIDA_INFO_COMPLEMENTAR
   *
   * <p>REGRA:REGRA_RUBRICA_COMPATIVEL_CATEGORIA
   *
   * <p>REGRA:REGRA_RUBRICA_COMPATIVEL_DECTERCEIRO
   *
   * <p>REGRA:REGRA_RUBRICA_COMPATIVEL_RESC
   *
   * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_PERIODO_APURACAO
   *
   * @return O objeto EvtRemun para população dos campos filhos
   */
  public EvtRemun<Evento_Remun> setEvtRemun() {
    if (this.evtRemun == null) {
      this.evtRemun = new EvtRemun(this);
    }
    return this.evtRemun;
  }

  /**
   * Evento Remuneração de Trabalhador vinculado ao RGPS
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
        "dmDev",
      })
  public static class EvtRemun<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do trabalhador. */
    private IdeTrabalhador ideTrabalhador;

    /**
     * Demonstrativo de valores devidos ao trabalhador
     *
     * <p>- Esse campo pode ser repetido até 999 vezes
     */
    private java.util.List<DmDev> dmDev;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
     *
     * @return O objeto Tipos.T_ideEvento_folha para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha<EvtRemun<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha(this);
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
    public Tipos.T_ideEmpregador<EvtRemun<T>> setIdeEmpregador() {
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
    public IdeTrabalhador<EvtRemun<T>> setIdeTrabalhador() {
      if (this.ideTrabalhador == null) {
        this.ideTrabalhador = new IdeTrabalhador(this);
      }
      return this.ideTrabalhador;
    }

    /**
     * Demonstrativo de valores devidos ao trabalhador
     *
     * @return Conteúdo do campo dmDev
     */
    public java.util.List<DmDev> getDmDev() {
      return this.dmDev;
    }

    /**
     * Demonstrativo de valores devidos ao trabalhador
     *
     * <p>- Esse campo pode ser repetido até 999 vezes
     *
     * <p>DESCRICAO_COMPLETA:Identificação de cada um dos demonstrativos de valores devidos ao
     * trabalhador.
     *
     * <p>CHAVE_GRUPO: {ideDmDev}
     *
     * <p>REGRA:REGRA_DEMONSTRATIVO
     *
     * @return O objeto DmDev para população dos campos filhos
     */
    public DmDev<EvtRemun<T>> setDmDev_Next() {
      if (this.dmDev == null) {
        this.dmDev = new java.util.ArrayList<>();
      }
      DmDev toAdd = new DmDev(this);
      this.dmDev.add(toAdd);
      return toAdd;
    }

    public EvtRemun(Object pai) {
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
          "infoMV",
          "infoComplem",
          "procJudTrab",
          "infoInterm",
        })
    public static class IdeTrabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /** Informação de múltiplos vínculos */
      private InfoMV infoMV;

      /** Informações complementares de identificação do trabalhador */
      private InfoComplem infoComplem;

      /**
       * Informações sobre a existência de processos judiciais do trabalhador
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<Tipos.T_procJudTrab> procJudTrab;

      /**
       * Informações relativas ao trabalho intermitente.
       *
       * <p>- Esse campo pode ser repetido até 31 vezes
       */
      private java.util.List<Tipos.T_infoInterm> infoInterm;

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
       * <p>Validação: Deve ser um CPF válido.
       *
       * @param cpfTrab Valor para atribuir ao campo cpfTrab
       * @return O próprio IdeTrabalhador para continuar populando outros campos
       */
      public IdeTrabalhador<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      /**
       * Informação de múltiplos vínculos
       *
       * @return Conteúdo do campo infoMV
       */
      public InfoMV getInfoMV() {
        return this.infoMV;
      }

      /**
       * Informação de múltiplos vínculos
       *
       * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente em caso de trabalhador que possua
       * outros vínculos/atividades nos quais já tenha ocorrido desconto de contribuição
       * previdenciária.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoMV para população dos campos filhos
       */
      public InfoMV<IdeTrabalhador<T>> setInfoMV() {
        if (this.infoMV == null) {
          this.infoMV = new InfoMV(this);
        }
        return this.infoMV;
      }

      /**
       * Informações complementares de identificação do trabalhador
       *
       * @return Conteúdo do campo infoComplem
       */
      public InfoComplem getInfoComplem() {
        return this.infoComplem;
      }

      /**
       * Informações complementares de identificação do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Grupo preenchido quando o evento de remuneração se referir a
       * trabalhador cuja categoria não está sujeita ao evento de admissão ou ao evento TSVE -
       * Início, bem como para informar remuneração devida pela empresa sucessora a empregado
       * desligado ainda na sucedida. No caso das categorias em que o envio do evento TSVE - Início
       * for opcional, o preenchimento do grupo somente é exigido se não houver o respectivo evento.
       * As informações complementares são necessárias para correta identificação do trabalhador.
       *
       * <p>CONDICAO_GRUPO: O ((se o trabalhador não tiver nenhum cadastro no RET) OU (se
       * {remunSuc}(1200_dmDev_infoPerAnt_ideADC_remunSuc) = [S])); N (se o trabalhador tiver
       * cadastro ativo no RET); OC (nos demais casos)
       *
       * @return O objeto InfoComplem para população dos campos filhos
       */
      public InfoComplem<IdeTrabalhador<T>> setInfoComplem() {
        if (this.infoComplem == null) {
          this.infoComplem = new InfoComplem(this);
        }
        return this.infoComplem;
      }

      /**
       * Informações sobre a existência de processos judiciais do trabalhador
       *
       * @return Conteúdo do campo procJudTrab
       */
      public java.util.List<Tipos.T_procJudTrab> getProcJudTrab() {
        return this.procJudTrab;
      }

      /**
       * Informações sobre a existência de processos judiciais do trabalhador
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre a existência de processos judiciais do trabalhador
       * com decisão favorável quanto à não incidência de contribuições sociais e/ou Imposto de
       * Renda.
       *
       * <p>CHAVE_GRUPO: {tpTrib}, {nrProcJud}, {codSusp}
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Tipos.T_procJudTrab para população dos campos filhos
       */
      public Tipos.T_procJudTrab<IdeTrabalhador<T>> setProcJudTrab_Next() {
        if (this.procJudTrab == null) {
          this.procJudTrab = new java.util.ArrayList<>();
        }
        Tipos.T_procJudTrab toAdd = new Tipos.T_procJudTrab(this);
        this.procJudTrab.add(toAdd);
        return toAdd;
      }

      /**
       * Informações relativas ao trabalho intermitente.
       *
       * @return Conteúdo do campo infoInterm
       */
      public java.util.List<Tipos.T_infoInterm> getInfoInterm() {
        return this.infoInterm;
      }

      /**
       * Informações relativas ao trabalho intermitente.
       *
       * <p>- Esse campo pode ser repetido até 31 vezes
       *
       * <p>CHAVE_GRUPO: {dia}
       *
       * <p>CONDICAO_GRUPO: O (se {codCateg}(1200_dmDev_codCateg) = [111] em
       * {perApur}(1200_ideEvento_perApur), {indApuracao}(1200_ideEvento_indApuracao) = [1] e
       * existir o grupo {infoPerApur}(1200_dmDev_infoPerApur)); N (nos demais casos)
       *
       * @return O objeto Tipos.T_infoInterm para população dos campos filhos
       */
      public Tipos.T_infoInterm<IdeTrabalhador<T>> setInfoInterm_Next() {
        if (this.infoInterm == null) {
          this.infoInterm = new java.util.ArrayList<>();
        }
        Tipos.T_infoInterm toAdd = new Tipos.T_infoInterm(this);
        this.infoInterm.add(toAdd);
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
       * Informação de múltiplos vínculos
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "indMV",
            "remunOutrEmpr",
          })
      public static class InfoMV<T> {

        /** Indicador de desconto da contribuição previdenciária do trabalhador. */
        private String indMV;

        /**
         * Remuneração recebida pelo trabalhador em outras empresas ou atividades
         *
         * <p>- Esse campo pode ser repetido até 999 vezes
         */
        private java.util.List<RemunOutrEmpr> remunOutrEmpr;

        /**
         * Indicador de desconto da contribuição previdenciária do trabalhador.
         *
         * @return Conteúdo do campo indMV
         */
        public String getIndMV() {
          return this.indMV;
        }

        /**
         * Indicador de desconto da contribuição previdenciária do trabalhador.
         *
         * @param indMV Valor para atribuir ao campo indMV
         * @return O próprio InfoMV para continuar populando outros campos
         */
        public InfoMV<T> setIndMV(String indMV) {
          if (!"1".equals(indMV) && !"2".equals(indMV) && !"3".equals(indMV))
            throw new RuntimeException(
                "Valor " + String.valueOf(indMV) + " inválido para o campo indMV");
          this.indMV = indMV;
          return this;
        }
        /**
         * O declarante aplica a(s) alíquota(s) de desconto do segurado sobre a remuneração por ele
         * informada (o percentual da(s) alíquota(s) será(ão) obtido(s) considerando a remuneração
         * total do trabalhador)
         *
         * @return O próprio InfoMV para continuar populando outros campos
         */
        public InfoMV<T> setIndMV_1() {
          this.indMV = "1";
          return this;
        }
        /**
         * O declarante aplica a(s) alíquota(s) de desconto do segurado sobre a diferença entre o
         * limite máximo do salário de contribuição e a remuneração de outra(s) empresa(s) para as
         * quais o trabalhador informou que houve o desconto
         *
         * @return O próprio InfoMV para continuar populando outros campos
         */
        public InfoMV<T> setIndMV_2() {
          this.indMV = "2";
          return this;
        }
        /**
         * O declarante não realiza desconto do segurado, uma vez que houve desconto sobre o limite
         * máximo de salário de contribuição em outra(s) empresa(s)
         *
         * @return O próprio InfoMV para continuar populando outros campos
         */
        public InfoMV<T> setIndMV_3() {
          this.indMV = "3";
          return this;
        }

        /**
         * Remuneração recebida pelo trabalhador em outras empresas ou atividades
         *
         * @return Conteúdo do campo remunOutrEmpr
         */
        public java.util.List<RemunOutrEmpr> getRemunOutrEmpr() {
          return this.remunOutrEmpr;
        }

        /**
         * Remuneração recebida pelo trabalhador em outras empresas ou atividades
         *
         * <p>- Esse campo pode ser repetido até 999 vezes
         *
         * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalhador que possui vínculo
         * empregatício com outra(s) empresa(s) e/ou que exerce outras atividades como contribuinte
         * individual, detalhando as empresas que efetuaram (ou efetuarão) desconto da contribuição.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codCateg}
         *
         * @return O objeto RemunOutrEmpr para população dos campos filhos
         */
        public RemunOutrEmpr<InfoMV<T>> setRemunOutrEmpr_Next() {
          if (this.remunOutrEmpr == null) {
            this.remunOutrEmpr = new java.util.ArrayList<>();
          }
          RemunOutrEmpr toAdd = new RemunOutrEmpr(this);
          this.remunOutrEmpr.add(toAdd);
          return toAdd;
        }

        public InfoMV(Object pai) {
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
         * Remuneração recebida pelo trabalhador em outras empresas ou atividades
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpInsc",
              "nrInsc",
              "codCateg",
              "vlrRemunOE",
            })
        public static class RemunOutrEmpr<T> {

          /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
          private String tpInsc;

          /**
           * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição
           * indicado no campo {remunOutrEmpr/tpInsc}(./tpInsc).
           */
          private String nrInsc;

          /** Preencher com o código da categoria do trabalhador na qual houve a remuneração. */
          private Integer codCateg;

          /**
           * Preencher com o valor da remuneração recebida pelo trabalhador na outra
           * empresa/atividade, sobre a qual houve desconto/recolhimento da contribuição do
           * segurado.
           */
          private Double vlrRemunOE;

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
           * @return O próprio RemunOutrEmpr para continuar populando outros campos
           */
          public RemunOutrEmpr<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
            this.tpInsc = tpInsc;
            return this;
          }
          /**
           * CNPJ
           *
           * @return O próprio RemunOutrEmpr para continuar populando outros campos
           */
          public RemunOutrEmpr<T> setTpInsc_1() {
            this.tpInsc = "1";
            return this;
          }
          /**
           * CPF
           *
           * @return O próprio RemunOutrEmpr para continuar populando outros campos
           */
          public RemunOutrEmpr<T> setTpInsc_2() {
            this.tpInsc = "2";
            return this;
          }

          /**
           * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição
           * indicado no campo {remunOutrEmpr/tpInsc}(./tpInsc).
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição
           * indicado no campo {remunOutrEmpr/tpInsc}(./tpInsc).
           *
           * <p>Validação: a) Se {indApuracao}(1200_ideEvento_indApuracao) = [1] e
           * {remunOutrEmpr/tpInsc}(./tpInsc) = [1], deve ser um CNPJ válido, diferente do CNPJ base
           * indicado no evento de Informações do Empregador (S-1000) e dos estabelecimentos
           * informados através do evento S-1005.
           *
           * <p>b) Se {indApuracao}(1200_ideEvento_indApuracao) = [1] e
           * {remunOutrEmpr/tpInsc}(./tpInsc) = [2], deve ser um CPF válido e diferente do CPF do
           * trabalhador e ainda, caso o empregador seja pessoa física, diferente do CPF do
           * empregador.
           *
           * <p>c) Se {indApuracao}(1200_ideEvento_indApuracao) = [2] e
           * {remunOutrEmpr/tpInsc}(./tpInsc) = [1], é permitido informar número de inscrição igual
           * ao CNPJ base indicado no evento de Informações do Empregador (S-1000) e aos
           * estabelecimentos informados através do evento S-1005.
           *
           * <p>d) Se {indApuracao}(1200_ideEvento_indApuracao) = [2] e
           * {remunOutrEmpr/tpInsc}(./tpInsc) = [2], deve ser um CPF válido e diferente do CPF do
           * trabalhador, mas é permitido informar número de inscrição igual ao CPF do empregador.
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio RemunOutrEmpr para continuar populando outros campos
           */
          public RemunOutrEmpr<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          /**
           * Preencher com o código da categoria do trabalhador na qual houve a remuneração.
           *
           * @return Conteúdo do campo codCateg
           */
          public Integer getCodCateg() {
            return this.codCateg;
          }

          /**
           * Preencher com o código da categoria do trabalhador na qual houve a remuneração.
           *
           * <p>Validação: Deve ser um código válido e existente na Tabela 01.
           *
           * @param codCateg Valor para atribuir ao campo codCateg
           * @return O próprio RemunOutrEmpr para continuar populando outros campos
           */
          public RemunOutrEmpr<T> setCodCateg(Integer codCateg) {
            this.codCateg = codCateg;
            return this;
          }

          /**
           * Preencher com o valor da remuneração recebida pelo trabalhador na outra
           * empresa/atividade, sobre a qual houve desconto/recolhimento da contribuição do
           * segurado.
           *
           * @return Conteúdo do campo vlrRemunOE
           */
          public Double getVlrRemunOE() {
            return this.vlrRemunOE;
          }

          /**
           * Preencher com o valor da remuneração recebida pelo trabalhador na outra
           * empresa/atividade, sobre a qual houve desconto/recolhimento da contribuição do
           * segurado.
           *
           * <p>Validação: Deve ser maior que 0 (zero).
           *
           * @param vlrRemunOE Valor para atribuir ao campo vlrRemunOE
           * @return O próprio RemunOutrEmpr para continuar populando outros campos
           */
          public RemunOutrEmpr<T> setVlrRemunOE(Double vlrRemunOE) {
            this.vlrRemunOE = vlrRemunOE;
            return this;
          }

          public RemunOutrEmpr(Object pai) {
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
       * Informações complementares de identificação do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nmTrab",
            "dtNascto",
            "sucessaoVinc",
          })
      public static class InfoComplem<T> {

        /** Informar o nome do trabalhador. */
        private String nmTrab;

        /** Preencher com a data de nascimento. */
        private javax.xml.datatype.XMLGregorianCalendar dtNascto;

        /** Grupo de informações da sucessão de vínculo trabalhista. */
        private SucessaoVinc sucessaoVinc;

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
         * @return O próprio InfoComplem para continuar populando outros campos
         */
        public InfoComplem<T> setNmTrab(String nmTrab) {
          this.nmTrab = nmTrab;
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
         * @return O próprio InfoComplem para continuar populando outros campos
         */
        public InfoComplem<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
          this.dtNascto = dtNascto;
          return this;
        }

        /**
         * Grupo de informações da sucessão de vínculo trabalhista.
         *
         * @return Conteúdo do campo sucessaoVinc
         */
        public SucessaoVinc getSucessaoVinc() {
          return this.sucessaoVinc;
        }

        /**
         * Grupo de informações da sucessão de vínculo trabalhista.
         *
         * <p>CONDICAO_GRUPO: O (se {remunSuc}(1200_dmDev_infoPerAnt_ideADC_remunSuc) = [S]); N (nos
         * demais casos)
         *
         * @return O objeto SucessaoVinc para população dos campos filhos
         */
        public SucessaoVinc<InfoComplem<T>> setSucessaoVinc() {
          if (this.sucessaoVinc == null) {
            this.sucessaoVinc = new SucessaoVinc(this);
          }
          return this.sucessaoVinc;
        }

        public InfoComplem(Object pai) {
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
         * Grupo de informações da sucessão de vínculo trabalhista.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpInsc",
              "nrInsc",
              "matricAnt",
              "dtAdm",
              "observacao",
            })
        public static class SucessaoVinc<T> {

          /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
          private String tpInsc;

          /**
           * Informar o número de inscrição do empregador anterior, de acordo com o tipo de
           * inscrição indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
           */
          private String nrInsc;

          /** Matrícula do trabalhador no empregador anterior. */
          private String matricAnt;

          /**
           * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado,
           * deve ser preenchida a data inicial do vínculo no primeiro empregador (data de início do
           * vínculo).
           */
          private javax.xml.datatype.XMLGregorianCalendar dtAdm;

          /** Observação. */
          private String observacao;

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
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
            this.tpInsc = tpInsc;
            return this;
          }
          /**
           * CNPJ
           *
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setTpInsc_1() {
            this.tpInsc = "1";
            return this;
          }
          /**
           * CPF
           *
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setTpInsc_2() {
            this.tpInsc = "2";
            return this;
          }

          /**
           * Informar o número de inscrição do empregador anterior, de acordo com o tipo de
           * inscrição indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Informar o número de inscrição do empregador anterior, de acordo com o tipo de
           * inscrição indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
           *
           * <p>Validação: Deve ser um número de inscrição válido e diferente da inscrição do
           * declarante, considerando as particularidades aplicadas à informação de CNPJ de órgão
           * público em S-1000.
           *
           * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [1], deve possuir 14 (catorze) algarismos e ser
           * diferente do CNPJ base do empregador (exceto se
           * {ideEmpregador/nrInsc}(1200_ideEmpregador_nrInsc) tiver 14 (catorze) algarismos) e dos
           * estabelecimentos informados através do evento S-1005.
           *
           * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [2], deve possuir 11 (onze) algarismos.
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          /**
           * Matrícula do trabalhador no empregador anterior.
           *
           * @return Conteúdo do campo matricAnt
           */
          public String getMatricAnt() {
            return this.matricAnt;
          }

          /**
           * Matrícula do trabalhador no empregador anterior.
           *
           * @param matricAnt Valor para atribuir ao campo matricAnt
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setMatricAnt(String matricAnt) {
            this.matricAnt = matricAnt;
            return this;
          }

          /**
           * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado,
           * deve ser preenchida a data inicial do vínculo no primeiro empregador (data de início do
           * vínculo).
           *
           * @return Conteúdo do campo dtAdm
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtAdm() {
            return this.dtAdm;
          }

          /**
           * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado,
           * deve ser preenchida a data inicial do vínculo no primeiro empregador (data de início do
           * vínculo).
           *
           * @param dtAdm Valor para atribuir ao campo dtAdm
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setDtAdm(javax.xml.datatype.XMLGregorianCalendar dtAdm) {
            this.dtAdm = dtAdm;
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
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setObservacao(String observacao) {
            this.observacao = observacao;
            return this;
          }

          public SucessaoVinc(Object pai) {
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

    /**
     * Demonstrativo de valores devidos ao trabalhador
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "ideDmDev",
          "codCateg",
          "infoPerApur",
          "infoPerAnt",
          "infoComplCont",
        })
    public static class DmDev<T> {

      /**
       * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
       * trabalhador. O empregador pode preencher este campo utilizando-se de um identificador
       * padrão para todos os trabalhadores; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       */
      private String ideDmDev;

      /** Preencher com o código da categoria do trabalhador. */
      private Integer codCateg;

      /** Informações relativas ao período de apuração. */
      private InfoPerApur infoPerApur;

      /** Informações relativas a períodos anteriores */
      private InfoPerAnt infoPerAnt;

      /** Informações complementares contratuais do trabalhador */
      private InfoComplCont infoComplCont;

      /**
       * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
       * trabalhador. O empregador pode preencher este campo utilizando-se de um identificador
       * padrão para todos os trabalhadores; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       *
       * @return Conteúdo do campo ideDmDev
       */
      public String getIdeDmDev() {
        return this.ideDmDev;
      }

      /**
       * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
       * trabalhador. O empregador pode preencher este campo utilizando-se de um identificador
       * padrão para todos os trabalhadores; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       *
       * <p>Validação: Deve ser um identificador único dentro do mesmo
       * {perApur}(1200_ideEvento_perApur) para cada um dos demonstrativos do trabalhador.
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
       * @return O próprio DmDev para continuar populando outros campos
       */
      public DmDev<T> setCodCateg(Integer codCateg) {
        this.codCateg = codCateg;
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
       * <p>CONDICAO_GRUPO: O (se não existir o grupo {infoPerAnt}(1200_dmDev_infoPerAnt)); OC (nos
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
       * <p>DESCRICAO_COMPLETA:Grupo destinado às informações de:
       *
       * <p>a) remuneração relativa a diferenças salariais provenientes de acordo coletivo,
       * convenção coletiva e dissídio;
       *
       * <p>b) remuneração relativa a diferenças de vencimento provenientes de disposições legais;
       *
       * <p>c) bases de cálculo para efeitos de apuração de FGTS resultantes de conversão de licença
       * saúde em acidente de trabalho;
       *
       * <p>d) verbas de natureza salarial ou não salarial devidas após o desligamento.
       *
       * <p>OBS.: As informações previstas acima podem se referir ao período de apuração definido em
       * {perApur}(1200_ideEvento_perApur) ou a períodos anteriores a
       * {perApur}(1200_ideEvento_perApur).
       *
       * <p>CONDICAO_GRUPO: N (se {indApuracao}(1200_ideEvento_indApuracao) = [2] ou
       * {codCateg}(1200_dmDev_codCateg) for diferente de [1XX, 2XX, 3XX, 721, 722, 901]); O (se não
       * existir o grupo {infoPerApur}(1200_dmDev_infoPerApur) e
       * {indApuracao}(1200_ideEvento_indApuracao) = [1]); OC (nos demais casos)
       *
       * @return O objeto InfoPerAnt para população dos campos filhos
       */
      public InfoPerAnt<DmDev<T>> setInfoPerAnt() {
        if (this.infoPerAnt == null) {
          this.infoPerAnt = new InfoPerAnt(this);
        }
        return this.infoPerAnt;
      }

      /**
       * Informações complementares contratuais do trabalhador
       *
       * @return Conteúdo do campo infoComplCont
       */
      public InfoComplCont getInfoComplCont() {
        return this.infoComplCont;
      }

      /**
       * Informações complementares contratuais do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente quando o evento de remuneração se
       * referir a trabalhador cuja categoria não estiver obrigada ao evento de início de TSVE e se
       * não houver evento S-2300 correspondente.
       *
       * <p>CONDICAO_GRUPO: O ((se {codCateg}(1200_dmDev_codCateg) = [2XX, 304, 305, 4XX, 7XX, 902])
       * E (se para o trabalhador não houver evento S-2300 ativo) E (se não for informado
       * {remunPerApur/matricula}(1200_dmDev_infoPerApur_ideEstabLot_remunPerApur_matricula) ou
       * {remunPerAnt/matricula}(1200_dmDev_infoPerAnt_ideADC_idePeriodo_ideEstabLot_remunPerAnt_matricula)));
       * OC ((se {codCateg}(1200_dmDev_codCateg) = [901, 903, 904]) E (se para o trabalhador não
       * houver evento S-2300 ativo) E (se não for informado
       * {remunPerApur/matricula}(1200_dmDev_infoPerApur_ideEstabLot_remunPerApur_matricula) ou
       * {remunPerAnt/matricula}(1200_dmDev_infoPerAnt_ideADC_idePeriodo_ideEstabLot_remunPerAnt_matricula)));
       * N (nos demais casos)
       *
       * @return O objeto InfoComplCont para população dos campos filhos
       */
      public InfoComplCont<DmDev<T>> setInfoComplCont() {
        if (this.infoComplCont == null) {
          this.infoComplCont = new InfoComplCont(this);
        }
        return this.infoComplCont;
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
            "ideEstabLot",
          })
      public static class InfoPerApur<T> {

        /**
         * Identificação do estabelecimento e lotação
         *
         * <p>- Esse campo pode ser repetido até 500 vezes
         */
        private java.util.List<IdeEstabLot> ideEstabLot;

        /**
         * Identificação do estabelecimento e lotação
         *
         * @return Conteúdo do campo ideEstabLot
         */
        public java.util.List<IdeEstabLot> getIdeEstabLot() {
          return this.ideEstabLot;
        }

        /**
         * Identificação do estabelecimento e lotação
         *
         * <p>- Esse campo pode ser repetido até 500 vezes
         *
         * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento e da lotação nos quais o
         * trabalhador possui remuneração no período de apuração. O estabelecimento identificado no
         * grupo pode ser: o número do CNPJ do estabelecimento da própria empresa (matriz/filial), o
         * número da obra (própria) no CNO, ou o número do CAEPF (no caso de pessoa física obrigada
         * a inscrição no cadastro de atividades econômicas da pessoa física). No caso específico do
         * trabalhador doméstico, o estabelecimento deve ser o próprio CPF do empregador.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
         *
         * @return O objeto IdeEstabLot para população dos campos filhos
         */
        public IdeEstabLot<InfoPerApur<T>> setIdeEstabLot_Next() {
          if (this.ideEstabLot == null) {
            this.ideEstabLot = new java.util.ArrayList<>();
          }
          IdeEstabLot toAdd = new IdeEstabLot(this);
          this.ideEstabLot.add(toAdd);
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

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpInsc",
              "nrInsc",
              "codLotacao",
              "qtdDiasAv",
              "remunPerApur",
            })
        public static class IdeEstabLot<T> {

          /**
           * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
           * acordo com as opções da Tabela 05.
           */
          private String tpInsc;

          /**
           * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo
           * de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
           */
          private String nrInsc;

          /** Informar o código atribuído pelo empregador para a lotação tributária. */
          private String codLotacao;

          /**
           * Quantidade de dias trabalhados no mês pelo trabalhador avulso no tomador de serviços
           * identificado em
           * {ideEstabLot/codLotacao}(1200_dmDev_infoPerApur_ideEstabLot_codLotacao). Cada dia,
           * total ou parcial, em que o trabalhador tenha prestado serviços ao tomador deve ser
           * considerado. Ex.: Se, em um mesmo mês, o trabalhador prestou serviços durante uma hora
           * em um dia e durante mais uma hora em outro dia, deve-se informar a quantidade de 2
           * dias.
           */
          private String qtdDiasAv;

          /**
           * Remuneração do trabalhador
           *
           * <p>- Esse campo pode ser repetido até 8 vezes
           */
          private java.util.List<RemunPerApur> remunPerApur;

          /**
           * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
           * acordo com as opções da Tabela 05.
           *
           * @return Conteúdo do campo tpInsc
           */
          public String getTpInsc() {
            return this.tpInsc;
          }

          /**
           * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
           * acordo com as opções da Tabela 05.
           *
           * <p>Validação: Se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em
           * S-1000 = [21], deve ser igual a [3, 4].
           *
           * <p>Se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 =
           * [22], deve ser igual a [3, 4] e, se for igual a [3] e não se tratar de empregado
           * doméstico, o CAEPF deve constar na Tabela S-1005 como sendo de segurado especial.
           *
           * <p>Nos demais casos ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib)
           * em S-1000 diferente de [21, 22]), deve ser igual a [1, 4].
           *
           * @param tpInsc Valor para atribuir ao campo tpInsc
           * @return O próprio IdeEstabLot para continuar populando outros campos
           */
          public IdeEstabLot<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
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
           * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo
           * de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo
           * de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
           *
           * <p>Validação: A inscrição informada deve ser compatível com
           * {ideEstabLot/tpInsc}(./tpInsc).
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
           * @param codLotacao Valor para atribuir ao campo codLotacao
           * @return O próprio IdeEstabLot para continuar populando outros campos
           */
          public IdeEstabLot<T> setCodLotacao(String codLotacao) {
            this.codLotacao = codLotacao;
            return this;
          }

          /**
           * Quantidade de dias trabalhados no mês pelo trabalhador avulso no tomador de serviços
           * identificado em
           * {ideEstabLot/codLotacao}(1200_dmDev_infoPerApur_ideEstabLot_codLotacao). Cada dia,
           * total ou parcial, em que o trabalhador tenha prestado serviços ao tomador deve ser
           * considerado. Ex.: Se, em um mesmo mês, o trabalhador prestou serviços durante uma hora
           * em um dia e durante mais uma hora em outro dia, deve-se informar a quantidade de 2
           * dias.
           *
           * @return Conteúdo do campo qtdDiasAv
           */
          public String getQtdDiasAv() {
            return this.qtdDiasAv;
          }

          /**
           * Quantidade de dias trabalhados no mês pelo trabalhador avulso no tomador de serviços
           * identificado em
           * {ideEstabLot/codLotacao}(1200_dmDev_infoPerApur_ideEstabLot_codLotacao). Cada dia,
           * total ou parcial, em que o trabalhador tenha prestado serviços ao tomador deve ser
           * considerado. Ex.: Se, em um mesmo mês, o trabalhador prestou serviços durante uma hora
           * em um dia e durante mais uma hora em outro dia, deve-se informar a quantidade de 2
           * dias.
           *
           * <p>Validação: Informação obrigatória e exclusiva se
           * {ideEstabLot/codLotacao}(./codLotacao) possuir
           * {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao) em S-1020 = [08, 09] em
           * {perApur}(1200_ideEvento_perApur) e se {indApuracao}(1200_ideEvento_indApuracao) = [1].
           *
           * <p>Se informado, deve ser um número entre 1 e 31, de acordo com o calendário anual.
           *
           * @param qtdDiasAv Valor para atribuir ao campo qtdDiasAv
           * @return O próprio IdeEstabLot para continuar populando outros campos
           */
          public IdeEstabLot<T> setQtdDiasAv(String qtdDiasAv) {
            this.qtdDiasAv = qtdDiasAv;
            return this;
          }

          /**
           * Remuneração do trabalhador
           *
           * @return Conteúdo do campo remunPerApur
           */
          public java.util.List<RemunPerApur> getRemunPerApur() {
            return this.remunPerApur;
          }

          /**
           * Remuneração do trabalhador
           *
           * <p>- Esse campo pode ser repetido até 8 vezes
           *
           * <p>DESCRICAO_COMPLETA:Informações relativas à remuneração do trabalhador no período de
           * apuração.
           *
           * <p>CHAVE_GRUPO: {matricula}
           *
           * @return O objeto RemunPerApur para população dos campos filhos
           */
          public RemunPerApur<IdeEstabLot<T>> setRemunPerApur_Next() {
            if (this.remunPerApur == null) {
              this.remunPerApur = new java.util.ArrayList<>();
            }
            RemunPerApur toAdd = new RemunPerApur(this);
            this.remunPerApur.add(toAdd);
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
           * Remuneração do trabalhador
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "matricula",
                "indSimples",
                "itensRemun",
                "infoAgNocivo",
              })
          public static class RemunPerApur<T> {

            /**
             * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
             * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
             */
            private String matricula;

            /** Indicador de contribuição substituída. */
            private String indSimples;

            /**
             * Itens da remuneração do trabalhador
             *
             * <p>- Esse campo pode ser repetido até 200 vezes
             */
            private java.util.List<T_itensRemun> itensRemun;

            /** Grau de exposição a agentes nocivos */
            private T_infoAgNocivo infoAgNocivo;

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
             * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento
             * S-2190, S-2200 ou S-2300 do respectivo contrato. Não preencher no caso de Trabalhador
             * Sem Vínculo de Emprego/Estatutário - TSVE sem informação de matrícula no evento
             * S-2300.
             *
             * @param matricula Valor para atribuir ao campo matricula
             * @return O próprio RemunPerApur para continuar populando outros campos
             */
            public RemunPerApur<T> setMatricula(String matricula) {
              this.matricula = matricula;
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
             * <p>Validação: O preenchimento do campo é obrigatório apenas no caso das empresas
             * enquadradas no regime de tributação Simples Nacional, com tributação previdenciária
             * substituída e não substituída
             * ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [03]).
             * Para os demais empregadores, não deve ser informado.
             *
             * @param indSimples Valor para atribuir ao campo indSimples
             * @return O próprio RemunPerApur para continuar populando outros campos
             */
            public RemunPerApur<T> setIndSimples(String indSimples) {
              if (!"1".equals(indSimples) && !"2".equals(indSimples) && !"3".equals(indSimples))
                throw new RuntimeException(
                    "Valor " + String.valueOf(indSimples) + " inválido para o campo indSimples");
              this.indSimples = indSimples;
              return this;
            }
            /**
             * Contribuição substituída integralmente
             *
             * @return O próprio RemunPerApur para continuar populando outros campos
             */
            public RemunPerApur<T> setIndSimples_1() {
              this.indSimples = "1";
              return this;
            }
            /**
             * Contribuição não substituída
             *
             * @return O próprio RemunPerApur para continuar populando outros campos
             */
            public RemunPerApur<T> setIndSimples_2() {
              this.indSimples = "2";
              return this;
            }
            /**
             * Contribuição não substituída concomitante com contribuição substituída
             *
             * @return O próprio RemunPerApur para continuar populando outros campos
             */
            public RemunPerApur<T> setIndSimples_3() {
              this.indSimples = "3";
              return this;
            }

            /**
             * Itens da remuneração do trabalhador
             *
             * @return Conteúdo do campo itensRemun
             */
            public java.util.List<T_itensRemun> getItensRemun() {
              return this.itensRemun;
            }

            /**
             * Itens da remuneração do trabalhador
             *
             * <p>- Esse campo pode ser repetido até 200 vezes
             *
             * <p>DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.
             *
             * @return O objeto T_itensRemun para população dos campos filhos
             */
            public T_itensRemun<RemunPerApur<T>> setItensRemun_Next() {
              if (this.itensRemun == null) {
                this.itensRemun = new java.util.ArrayList<>();
              }
              T_itensRemun toAdd = new T_itensRemun(this);
              this.itensRemun.add(toAdd);
              return toAdd;
            }

            /**
             * Grau de exposição a agentes nocivos
             *
             * @return Conteúdo do campo infoAgNocivo
             */
            public T_infoAgNocivo getInfoAgNocivo() {
              return this.infoAgNocivo;
            }

            /**
             * Grau de exposição a agentes nocivos
             *
             * <p>DESCRICAO_COMPLETA:Grupo referente ao detalhamento do grau de exposição do
             * trabalhador aos agentes nocivos que ensejam a cobrança da contribuição adicional para
             * financiamento dos benefícios de aposentadoria especial.
             *
             * <p>CONDICAO_GRUPO: O (se {codCateg}(1200_dmDev_codCateg) = [1XX, 2XX, 3XX, 731, 734,
             * 738]); N (nos demais casos)
             *
             * @return O objeto T_infoAgNocivo para população dos campos filhos
             */
            public T_infoAgNocivo<RemunPerApur<T>> setInfoAgNocivo() {
              if (this.infoAgNocivo == null) {
                this.infoAgNocivo = new T_infoAgNocivo(this);
              }
              return this.infoAgNocivo;
            }

            public RemunPerApur(Object pai) {
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

      /**
       * Informações relativas a períodos anteriores
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "ideADC",
          })
      public static class InfoPerAnt<T> {

        /**
         * Instrumento ou situação ensejadora da remuneração em períodos anteriores
         *
         * <p>- Esse campo pode ser repetido até 8 vezes
         */
        private java.util.List<IdeADC> ideADC;

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
         * <p>- Esse campo pode ser repetido até 8 vezes
         *
         * <p>DESCRICAO_COMPLETA:Identificação do instrumento ou situação ensejadora da remuneração
         * relativa a períodos de apuração anteriores.
         *
         * <p>CHAVE_GRUPO: {dtAcConv}, {tpAcConv}
         *
         * @return O objeto IdeADC para população dos campos filhos
         */
        public IdeADC<InfoPerAnt<T>> setIdeADC_Next() {
          if (this.ideADC == null) {
            this.ideADC = new java.util.ArrayList<>();
          }
          IdeADC toAdd = new IdeADC(this);
          this.ideADC.add(toAdd);
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
              "idePeriodo",
            })
        public static class IdeADC<T> {

          /**
           * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da conversão da
           * licença saúde em acidente de trabalho.
           */
          private javax.xml.datatype.XMLGregorianCalendar dtAcConv;

          /**
           * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
           * apuração anteriores.
           */
          private String tpAcConv;

          /**
           * Descrição do instrumento ou situação que originou o pagamento das verbas relativas a
           * períodos anteriores.
           */
          private String dsc;

          /**
           * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
           * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
           */
          private String remunSuc;

          /**
           * Identificação do período de referência da remuneração
           *
           * <p>- Esse campo pode ser repetido até 180 vezes
           */
          private java.util.List<IdePeriodo> idePeriodo;

          /**
           * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da conversão da
           * licença saúde em acidente de trabalho.
           *
           * @return Conteúdo do campo dtAcConv
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtAcConv() {
            return this.dtAcConv;
          }

          /**
           * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da conversão da
           * licença saúde em acidente de trabalho.
           *
           * <p>Validação: Informação obrigatória se {tpAcConv}(./tpAcConv) = [A, B, C, D, E]. Se
           * preenchida, seu mês/ano deve ser igual ou anterior ao período de apuração, informado em
           * {perApur}(1200_ideEvento_perApur). A data deve ser igual ou posterior a 01/01/1890.
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
           * Descrição do instrumento ou situação que originou o pagamento das verbas relativas a
           * períodos anteriores.
           *
           * @return Conteúdo do campo dsc
           */
          public String getDsc() {
            return this.dsc;
          }

          /**
           * Descrição do instrumento ou situação que originou o pagamento das verbas relativas a
           * períodos anteriores.
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

          /**
           * Identificação do período de referência da remuneração
           *
           * @return Conteúdo do campo idePeriodo
           */
          public java.util.List<IdePeriodo> getIdePeriodo() {
            return this.idePeriodo;
          }

          /**
           * Identificação do período de referência da remuneração
           *
           * <p>- Esse campo pode ser repetido até 180 vezes
           *
           * <p>DESCRICAO_COMPLETA:Identificação do período ao qual se referem as diferenças de
           * remuneração.
           *
           * <p>CHAVE_GRUPO: {perRef}
           *
           * @return O objeto IdePeriodo para população dos campos filhos
           */
          public IdePeriodo<IdeADC<T>> setIdePeriodo_Next() {
            if (this.idePeriodo == null) {
              this.idePeriodo = new java.util.ArrayList<>();
            }
            IdePeriodo toAdd = new IdePeriodo(this);
            this.idePeriodo.add(toAdd);
            return toAdd;
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
          /**
           * Identificação do período de referência da remuneração
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "perRef",
                "ideEstabLot",
              })
          public static class IdePeriodo<T> {

            /**
             * Informar o período ao qual se refere o complemento de remuneração, no formato
             * AAAA-MM.
             */
            private String perRef;

            /**
             * Identificação do estabelecimento e lotação
             *
             * <p>- Esse campo pode ser repetido até 500 vezes
             */
            private java.util.List<IdeEstabLot> ideEstabLot;

            /**
             * Informar o período ao qual se refere o complemento de remuneração, no formato
             * AAAA-MM.
             *
             * @return Conteúdo do campo perRef
             */
            public String getPerRef() {
              return this.perRef;
            }

            /**
             * Informar o período ao qual se refere o complemento de remuneração, no formato
             * AAAA-MM.
             *
             * <p>Validação: Deve ser igual ou anterior ao período de apuração informado em
             * {perApur}(/ideEvento_perApur).
             *
             * <p>Deve ser informado no formato AAAA-MM.
             *
             * @param perRef Valor para atribuir ao campo perRef
             * @return O próprio IdePeriodo para continuar populando outros campos
             */
            public IdePeriodo<T> setPerRef(String perRef) {
              this.perRef = perRef;
              return this;
            }

            /**
             * Identificação do estabelecimento e lotação
             *
             * @return Conteúdo do campo ideEstabLot
             */
            public java.util.List<IdeEstabLot> getIdeEstabLot() {
              return this.ideEstabLot;
            }

            /**
             * Identificação do estabelecimento e lotação
             *
             * <p>- Esse campo pode ser repetido até 500 vezes
             *
             * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento e da lotação ao qual se
             * referem as diferenças de remuneração do mês identificado no grupo superior.
             *
             * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
             *
             * @return O objeto IdeEstabLot para população dos campos filhos
             */
            public IdeEstabLot<IdePeriodo<T>> setIdeEstabLot_Next() {
              if (this.ideEstabLot == null) {
                this.ideEstabLot = new java.util.ArrayList<>();
              }
              IdeEstabLot toAdd = new IdeEstabLot(this);
              this.ideEstabLot.add(toAdd);
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
            /**
             * Identificação do estabelecimento e lotação
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
                  "remunPerAnt",
                })
            public static class IdeEstabLot<T> {

              /**
               * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
               * acordo com as opções da Tabela 05.
               */
              private String tpInsc;

              /**
               * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o
               * tipo de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
               */
              private String nrInsc;

              /** Informar o código atribuído pelo empregador para a lotação tributária. */
              private String codLotacao;

              /**
               * Remuneração do trabalhador
               *
               * <p>- Esse campo pode ser repetido até 8 vezes
               */
              private java.util.List<RemunPerAnt> remunPerAnt;

              /**
               * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
               * acordo com as opções da Tabela 05.
               *
               * @return Conteúdo do campo tpInsc
               */
              public String getTpInsc() {
                return this.tpInsc;
              }

              /**
               * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
               * acordo com as opções da Tabela 05.
               *
               * <p>Validação: Se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib)
               * em S-1000 = [21], deve ser igual a [3, 4].
               *
               * <p>Se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 =
               * [22], deve ser igual a [3, 4] e, se for igual a [3] e não se tratar de empregado
               * doméstico, o CAEPF deve constar na Tabela S-1005 como sendo de segurado especial.
               *
               * <p>Nos demais casos
               * ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000
               * diferente de [21, 22]), deve ser igual a [1, 4].
               *
               * @param tpInsc Valor para atribuir ao campo tpInsc
               * @return O próprio IdeEstabLot para continuar populando outros campos
               */
              public IdeEstabLot<T> setTpInsc(String tpInsc) {
                if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
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
               * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o
               * tipo de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
               *
               * @return Conteúdo do campo nrInsc
               */
              public String getNrInsc() {
                return this.nrInsc;
              }

              /**
               * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o
               * tipo de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
               *
               * <p>Validação: A inscrição informada deve ser compatível com
               * {ideEstabLot/tpInsc}(./tpInsc).
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
               * @param codLotacao Valor para atribuir ao campo codLotacao
               * @return O próprio IdeEstabLot para continuar populando outros campos
               */
              public IdeEstabLot<T> setCodLotacao(String codLotacao) {
                this.codLotacao = codLotacao;
                return this;
              }

              /**
               * Remuneração do trabalhador
               *
               * @return Conteúdo do campo remunPerAnt
               */
              public java.util.List<RemunPerAnt> getRemunPerAnt() {
                return this.remunPerAnt;
              }

              /**
               * Remuneração do trabalhador
               *
               * <p>- Esse campo pode ser repetido até 8 vezes
               *
               * <p>DESCRICAO_COMPLETA:Informações relativas à remuneração do trabalhador em
               * períodos anteriores.
               *
               * <p>CHAVE_GRUPO: {matricula}
               *
               * @return O objeto RemunPerAnt para população dos campos filhos
               */
              public RemunPerAnt<IdeEstabLot<T>> setRemunPerAnt_Next() {
                if (this.remunPerAnt == null) {
                  this.remunPerAnt = new java.util.ArrayList<>();
                }
                RemunPerAnt toAdd = new RemunPerAnt(this);
                this.remunPerAnt.add(toAdd);
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
               * Remuneração do trabalhador
               *
               * @param <T> Tipo do retorno do método finish()
               */
              @XmlAccessorType(XmlAccessType.FIELD)
              @XmlType(
                  name = "",
                  propOrder = {
                    "matricula",
                    "indSimples",
                    "itensRemun",
                    "infoAgNocivo",
                  })
              public static class RemunPerAnt<T> {

                /**
                 * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público,
                 * a matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
                 */
                private String matricula;

                /** Indicador de contribuição substituída. */
                private String indSimples;

                /**
                 * Itens da remuneração do trabalhador
                 *
                 * <p>- Esse campo pode ser repetido até 200 vezes
                 */
                private java.util.List<T_itensRemun> itensRemun;

                /** Grau de exposição a agentes nocivos */
                private T_infoAgNocivo infoAgNocivo;

                /**
                 * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público,
                 * a matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
                 *
                 * @return Conteúdo do campo matricula
                 */
                public String getMatricula() {
                  return this.matricula;
                }

                /**
                 * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público,
                 * a matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
                 *
                 * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento
                 * S-2190, S-2200 ou S-2300 do respectivo contrato. Não preencher no caso de TSVE
                 * sem informação de matrícula no evento S-2300 ou se
                 * {remunSuc}(1200_dmDev_infoPerAnt_ideADC_remunSuc) = [S].
                 *
                 * @param matricula Valor para atribuir ao campo matricula
                 * @return O próprio RemunPerAnt para continuar populando outros campos
                 */
                public RemunPerAnt<T> setMatricula(String matricula) {
                  this.matricula = matricula;
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
                 * <p>Validação: O preenchimento do campo é obrigatório apenas no caso das empresas
                 * enquadradas no regime de tributação Simples Nacional, com tributação
                 * previdenciária substituída e não substituída
                 * ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 =
                 * [03]). Para os demais empregadores, não deve ser informado.
                 *
                 * @param indSimples Valor para atribuir ao campo indSimples
                 * @return O próprio RemunPerAnt para continuar populando outros campos
                 */
                public RemunPerAnt<T> setIndSimples(String indSimples) {
                  if (!"1".equals(indSimples) && !"2".equals(indSimples) && !"3".equals(indSimples))
                    throw new RuntimeException(
                        "Valor "
                            + String.valueOf(indSimples)
                            + " inválido para o campo indSimples");
                  this.indSimples = indSimples;
                  return this;
                }
                /**
                 * Contribuição substituída integralmente
                 *
                 * @return O próprio RemunPerAnt para continuar populando outros campos
                 */
                public RemunPerAnt<T> setIndSimples_1() {
                  this.indSimples = "1";
                  return this;
                }
                /**
                 * Contribuição não substituída
                 *
                 * @return O próprio RemunPerAnt para continuar populando outros campos
                 */
                public RemunPerAnt<T> setIndSimples_2() {
                  this.indSimples = "2";
                  return this;
                }
                /**
                 * Contribuição não substituída concomitante com contribuição substituída
                 *
                 * @return O próprio RemunPerAnt para continuar populando outros campos
                 */
                public RemunPerAnt<T> setIndSimples_3() {
                  this.indSimples = "3";
                  return this;
                }

                /**
                 * Itens da remuneração do trabalhador
                 *
                 * @return Conteúdo do campo itensRemun
                 */
                public java.util.List<T_itensRemun> getItensRemun() {
                  return this.itensRemun;
                }

                /**
                 * Itens da remuneração do trabalhador
                 *
                 * <p>- Esse campo pode ser repetido até 200 vezes
                 *
                 * <p>DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.
                 *
                 * @return O objeto T_itensRemun para população dos campos filhos
                 */
                public T_itensRemun<RemunPerAnt<T>> setItensRemun_Next() {
                  if (this.itensRemun == null) {
                    this.itensRemun = new java.util.ArrayList<>();
                  }
                  T_itensRemun toAdd = new T_itensRemun(this);
                  this.itensRemun.add(toAdd);
                  return toAdd;
                }

                /**
                 * Grau de exposição a agentes nocivos
                 *
                 * @return Conteúdo do campo infoAgNocivo
                 */
                public T_infoAgNocivo getInfoAgNocivo() {
                  return this.infoAgNocivo;
                }

                /**
                 * Grau de exposição a agentes nocivos
                 *
                 * <p>DESCRICAO_COMPLETA:Grupo referente ao detalhamento do grau de exposição do
                 * trabalhador aos agentes nocivos que ensejam a cobrança da contribuição adicional
                 * para financiamento dos benefícios de aposentadoria especial.
                 *
                 * <p>CONDICAO_GRUPO: O (se {codCateg}(1200_dmDev_codCateg) = [1XX, 2XX, 3XX]); N
                 * (nos demais casos)
                 *
                 * @return O objeto T_infoAgNocivo para população dos campos filhos
                 */
                public T_infoAgNocivo<RemunPerAnt<T>> setInfoAgNocivo() {
                  if (this.infoAgNocivo == null) {
                    this.infoAgNocivo = new T_infoAgNocivo(this);
                  }
                  return this.infoAgNocivo;
                }

                public RemunPerAnt(Object pai) {
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
         * <p>Validação: Deve ser um código válido e existente na tabela de CBO, com 6 (seis)
         * posições.
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
         * <p>Validação: O campo deve ser preenchido apenas se atendida uma das condições a seguir
         * apresentadas:
         *
         * <p>a) {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [06,
         * 07];
         *
         * <p>b) {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [21,
         * 22] e existir remuneração para o trabalhador vinculada a um tipo de CAEPF informado em
         * S-1005 como produtor rural ou segurado especial.
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
         * <p>Validação: Preenchimento obrigatório e exclusivo se
         * {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [22],
         * {natAtividade}(./natAtividade) = [2] e {indApuracao}(1200_ideEvento_indApuracao) = [1].
         * Neste caso, preencher com um número entre 1 e 31, de acordo com o calendário anual.
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
  }

  /**
   * Itens da remuneração do trabalhador
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "codRubr",
        "ideTabRubr",
        "qtdRubr",
        "fatorRubr",
        "vrRubr",
        "indApurIR",
      })
  public static class T_itensRemun<T> {

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
     */
    private String codRubr;

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     */
    private String ideTabRubr;

    /**
     * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). Ex.:
     * Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora extra, quantidade
     * de dias trabalhados relacionada com uma rubrica de salário, etc.
     */
    private Double qtdRubr;

    /**
     * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de horas
     * extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
     */
    private Double fatorRubr;

    /** Valor total da rubrica. */
    private Double vrRubr;

    /** Indicativo de tipo de apuração de IR. */
    private String indApurIR;

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
     *
     * @return Conteúdo do campo codRubr
     */
    public String getCodRubr() {
      return this.codRubr;
    }

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
     *
     * <p>Validação: Não pode ser utilizada rubrica:
     *
     * <p>a) cujo {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010 seja igual a
     * [25, 26, 51] se {codCateg}(1200_dmDev_codCateg) pertencer ao grupo "Contribuinte Individual"
     * ou "Bolsista" da Tabela 01;
     *
     * <p>b) cuja {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 seja igual a
     * [1801, 9209, 9210, 9220], desde que {perApur}(1200_ideEvento_perApur) >= [2021-05] (se
     * {indApuracao}(1200_ideEvento_indApuracao) = [1]) ou {perApur}(1200_ideEvento_perApur) >=
     * [2021] (se {indApuracao}(1200_ideEvento_indApuracao) = [2]).
     *
     * @param codRubr Valor para atribuir ao campo codRubr
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setCodRubr(String codRubr) {
      this.codRubr = codRubr;
      return this;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     *
     * @return Conteúdo do campo ideTabRubr
     */
    public String getIdeTabRubr() {
      return this.ideTabRubr;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     *
     * @param ideTabRubr Valor para atribuir ao campo ideTabRubr
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setIdeTabRubr(String ideTabRubr) {
      this.ideTabRubr = ideTabRubr;
      return this;
    }

    /**
     * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). Ex.:
     * Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora extra, quantidade
     * de dias trabalhados relacionada com uma rubrica de salário, etc.
     *
     * @return Conteúdo do campo qtdRubr
     */
    public Double getQtdRubr() {
      return this.qtdRubr;
    }

    /**
     * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). Ex.:
     * Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora extra, quantidade
     * de dias trabalhados relacionada com uma rubrica de salário, etc.
     *
     * <p>Preenchimento obrigatório quando se tratar de rubrica relativa a faltas ou Descanso
     * Semanal Remunerado - DSR sobre faltas (nesse caso, informar a quantidade de dias).
     *
     * <p>Validação: Deve ser maior que 0 (zero). Informação obrigatória se {codRubr}(./codRubr)
     * tiver {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 igual a [9207,
     * 9211].
     *
     * @param qtdRubr Valor para atribuir ao campo qtdRubr
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setQtdRubr(Double qtdRubr) {
      this.qtdRubr = qtdRubr;
      return this;
    }

    /**
     * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de horas
     * extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
     *
     * @return Conteúdo do campo fatorRubr
     */
    public Double getFatorRubr() {
      return this.fatorRubr;
    }

    /**
     * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de horas
     * extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
     *
     * <p>Validação: Deve ser maior que 0 (zero).
     *
     * @param fatorRubr Valor para atribuir ao campo fatorRubr
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setFatorRubr(Double fatorRubr) {
      this.fatorRubr = fatorRubr;
      return this;
    }

    /**
     * Valor total da rubrica.
     *
     * @return Conteúdo do campo vrRubr
     */
    public Double getVrRubr() {
      return this.vrRubr;
    }

    /**
     * Valor total da rubrica.
     *
     * <p>Validação: Deve ser maior que 0 (zero).
     *
     * @param vrRubr Valor para atribuir ao campo vrRubr
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setVrRubr(Double vrRubr) {
      this.vrRubr = vrRubr;
      return this;
    }

    /**
     * Indicativo de tipo de apuração de IR.
     *
     * @return Conteúdo do campo indApurIR
     */
    public String getIndApurIR() {
      return this.indApurIR;
    }

    /**
     * Indicativo de tipo de apuração de IR.
     *
     * <p>Validação: Informação obrigatória e exclusiva se {perApur}(1200_ideEvento_perApur) >=
     * [2021-05] (se {indApuracao}(1200_ideEvento_indApuracao) = [1]) ou se
     * {perApur}(1200_ideEvento_perApur) >= [2021] (se {indApuracao}(1200_ideEvento_indApuracao) =
     * [2]).
     *
     * @param indApurIR Valor para atribuir ao campo indApurIR
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setIndApurIR(String indApurIR) {
      if (!"0".equals(indApurIR) && !"1".equals(indApurIR))
        throw new RuntimeException(
            "Valor " + String.valueOf(indApurIR) + " inválido para o campo indApurIR");
      this.indApurIR = indApurIR;
      return this;
    }
    /**
     * Normal (apuração sob a folha de pagamento declarada no eSocial)
     *
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setIndApurIR_0() {
      this.indApurIR = "0";
      return this;
    }
    /**
     * Situação especial de apuração de IR
     *
     * @return O próprio T_itensRemun para continuar populando outros campos
     */
    public T_itensRemun<T> setIndApurIR_1() {
      this.indApurIR = "1";
      return this;
    }

    public T_itensRemun(Object pai) {
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
   * Grau de exposição a agentes nocivos
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "grauExp",
      })
  public static class T_infoAgNocivo<T> {

    /**
     * Preencher com o código que representa o grau de exposição a agentes nocivos, conforme Tabela
     * 02.
     */
    private String grauExp;

    /**
     * Preencher com o código que representa o grau de exposição a agentes nocivos, conforme Tabela
     * 02.
     *
     * @return Conteúdo do campo grauExp
     */
    public String getGrauExp() {
      return this.grauExp;
    }

    /**
     * Preencher com o código que representa o grau de exposição a agentes nocivos, conforme Tabela
     * 02.
     *
     * @param grauExp Valor para atribuir ao campo grauExp
     * @return O próprio T_infoAgNocivo para continuar populando outros campos
     */
    public T_infoAgNocivo<T> setGrauExp(String grauExp) {
      if (!"1".equals(grauExp)
          && !"2".equals(grauExp)
          && !"3".equals(grauExp)
          && !"4".equals(grauExp))
        throw new RuntimeException(
            "Valor " + String.valueOf(grauExp) + " inválido para o campo grauExp");
      this.grauExp = grauExp;
      return this;
    }
    /**
     * Não ensejador de aposentadoria especial
     *
     * @return O próprio T_infoAgNocivo para continuar populando outros campos
     */
    public T_infoAgNocivo<T> setGrauExp_1() {
      this.grauExp = "1";
      return this;
    }
    /**
     * Ensejador de aposentadoria especial - FAE15_12% (15 anos de contribuição e alíquota de 12%)
     *
     * @return O próprio T_infoAgNocivo para continuar populando outros campos
     */
    public T_infoAgNocivo<T> setGrauExp_2() {
      this.grauExp = "2";
      return this;
    }
    /**
     * Ensejador de aposentadoria especial - FAE20_09% (20 anos de contribuição e alíquota de 9%)
     *
     * @return O próprio T_infoAgNocivo para continuar populando outros campos
     */
    public T_infoAgNocivo<T> setGrauExp_3() {
      this.grauExp = "3";
      return this;
    }
    /**
     * Ensejador de aposentadoria especial - FAE25_06% (25 anos de contribuição e alíquota de 6%)
     *
     * @return O próprio T_infoAgNocivo para continuar populando outros campos
     */
    public T_infoAgNocivo<T> setGrauExp_4() {
      this.grauExp = "4";
      return this;
    }

    public T_infoAgNocivo(Object pai) {
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
