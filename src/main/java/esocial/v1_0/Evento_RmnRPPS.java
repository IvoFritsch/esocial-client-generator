package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1202 - Remuneração de Servidor vinculado ao Regime Próprio de Previd. Social */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtRmnRPPS",
    })
@XmlRootElement(name = "eSocial")
public class Evento_RmnRPPS {

  /** Evento Remuneração de Servidor vinculado ao RPPS */
  private EvtRmnRPPS evtRmnRPPS;

  /**
   * Evento Remuneração de Servidor vinculado ao RPPS
   *
   * @return Conteúdo do campo evtRmnRPPS
   */
  public EvtRmnRPPS getEvtRmnRPPS() {
    return this.evtRmnRPPS;
  }

  /**
   * Evento Remuneração de Servidor vinculado ao RPPS
   *
   * <p>DESCRICAO_COMPLETA:Evento Remuneração de Servidor vinculado ao Regime Próprio de Previdência
   * Social.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_COMPATIBILIDADE_CATEGORIA_CLASSTRIB
   *
   * <p>REGRA:REGRA_COMPATIB_REGIME_PREV
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
   * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_PERIODO_APURACAO
   *
   * @return O objeto EvtRmnRPPS para população dos campos filhos
   */
  public EvtRmnRPPS<Evento_RmnRPPS> setEvtRmnRPPS() {
    if (this.evtRmnRPPS == null) {
      this.evtRmnRPPS = new EvtRmnRPPS(this);
    }
    return this.evtRmnRPPS;
  }

  /**
   * Evento Remuneração de Servidor vinculado ao RPPS
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
  public static class EvtRmnRPPS<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_opp ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

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
    public Tipos.T_ideEvento_folha_opp<EvtRmnRPPS<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj<EvtRmnRPPS<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador_cnpj(this);
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
    public IdeTrabalhador<EvtRmnRPPS<T>> setIdeTrabalhador() {
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
    public DmDev<EvtRmnRPPS<T>> setDmDev_Next() {
      if (this.dmDev == null) {
        this.dmDev = new java.util.ArrayList<>();
      }
      DmDev toAdd = new DmDev(this);
      this.dmDev.add(toAdd);
      return toAdd;
    }

    public EvtRmnRPPS(Object pai) {
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
          "infoComplem",
        })
    public static class IdeTrabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /** Informações complementares de identificação do trabalhador */
      private InfoComplem infoComplem;

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
       * Início, bem como para informar remuneração devida pelo órgão sucessor a servidor desligado
       * ainda no sucedido. No caso das categorias em que o evento TSVE - Início for opcional, o
       * preenchimento do grupo somente é exigido se não existir o respectivo evento. As informações
       * complementares são necessárias para correta identificação do trabalhador.
       *
       * <p>CONDICAO_GRUPO: O ((se o trabalhador não tiver nenhum cadastro no RET) OU (se
       * {remunOrgSuc}(1202_dmDev_infoPerAnt_remunOrgSuc) = [S])); N (se o trabalhador tiver
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

        /** Grupo de informações da sucessão de vínculo. */
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
         * Grupo de informações da sucessão de vínculo.
         *
         * @return Conteúdo do campo sucessaoVinc
         */
        public SucessaoVinc getSucessaoVinc() {
          return this.sucessaoVinc;
        }

        /**
         * Grupo de informações da sucessão de vínculo.
         *
         * <p>CONDICAO_GRUPO: O (se {remunOrgSuc}(1202_dmDev_infoPerAnt_remunOrgSuc) = [S]); N (nos
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
         * Grupo de informações da sucessão de vínculo.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "cnpjOrgaoAnt",
              "matricAnt",
              "dtExercicio",
              "observacao",
            })
        public static class SucessaoVinc<T> {

          /** Informar o CNPJ do órgão público anterior. */
          private String cnpjOrgaoAnt;

          /** Matrícula do trabalhador no órgão público anterior. */
          private String matricAnt;

          /**
           * Preencher com a data de exercício do servidor. No caso de transferência do servidor,
           * deve ser preenchida a data inicial do vínculo no primeiro órgão público (data de início
           * do vínculo).
           */
          private javax.xml.datatype.XMLGregorianCalendar dtExercicio;

          /** Observação. */
          private String observacao;

          /**
           * Informar o CNPJ do órgão público anterior.
           *
           * @return Conteúdo do campo cnpjOrgaoAnt
           */
          public String getCnpjOrgaoAnt() {
            return this.cnpjOrgaoAnt;
          }

          /**
           * Informar o CNPJ do órgão público anterior.
           *
           * <p>Validação: Deve ser um CNPJ válido e diferente da inscrição do declarante,
           * considerando as particularidades aplicadas à informação de CNPJ de órgão público em
           * S-1000. Além disso, deve possuir 14 (catorze) algarismos e ser diferente do CNPJ base
           * do órgão público declarante (exceto se
           * {ideEmpregador/nrInsc}(1202_ideEmpregador_nrInsc) tiver 14 (catorze) algarismos) e dos
           * estabelecimentos informados através do evento S-1005.
           *
           * @param cnpjOrgaoAnt Valor para atribuir ao campo cnpjOrgaoAnt
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setCnpjOrgaoAnt(String cnpjOrgaoAnt) {
            this.cnpjOrgaoAnt = cnpjOrgaoAnt;
            return this;
          }

          /**
           * Matrícula do trabalhador no órgão público anterior.
           *
           * @return Conteúdo do campo matricAnt
           */
          public String getMatricAnt() {
            return this.matricAnt;
          }

          /**
           * Matrícula do trabalhador no órgão público anterior.
           *
           * @param matricAnt Valor para atribuir ao campo matricAnt
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setMatricAnt(String matricAnt) {
            this.matricAnt = matricAnt;
            return this;
          }

          /**
           * Preencher com a data de exercício do servidor. No caso de transferência do servidor,
           * deve ser preenchida a data inicial do vínculo no primeiro órgão público (data de início
           * do vínculo).
           *
           * @return Conteúdo do campo dtExercicio
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtExercicio() {
            return this.dtExercicio;
          }

          /**
           * Preencher com a data de exercício do servidor. No caso de transferência do servidor,
           * deve ser preenchida a data inicial do vínculo no primeiro órgão público (data de início
           * do vínculo).
           *
           * @param dtExercicio Valor para atribuir ao campo dtExercicio
           * @return O próprio SucessaoVinc para continuar populando outros campos
           */
          public SucessaoVinc<T> setDtExercicio(
              javax.xml.datatype.XMLGregorianCalendar dtExercicio) {
            this.dtExercicio = dtExercicio;
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
        })
    public static class DmDev<T> {

      /**
       * Identificador atribuído pelo órgão público para o demonstrativo de valores devidos ao
       * trabalhador. O ente público pode preencher este campo utilizando-se de um identificador
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

      /**
       * Identificador atribuído pelo órgão público para o demonstrativo de valores devidos ao
       * trabalhador. O ente público pode preencher este campo utilizando-se de um identificador
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
       * Identificador atribuído pelo órgão público para o demonstrativo de valores devidos ao
       * trabalhador. O ente público pode preencher este campo utilizando-se de um identificador
       * padrão para todos os trabalhadores; no entanto, havendo mais de um demonstrativo relativo a
       * uma mesma competência, devem ser utilizados identificadores diferentes para cada um dos
       * demonstrativos.
       *
       * <p>Validação: Deve ser um identificador único dentro do mesmo
       * {perApur}(1202_ideEvento_perApur) para cada um dos demonstrativos do trabalhador.
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
       * <p>CONDICAO_GRUPO: O (se não existir o grupo {infoPerAnt}(1202_dmDev_infoPerAnt)); OC (nos
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
       * <p>a) remuneração relativa a diferenças de vencimento provenientes de disposições legais;
       *
       * <p>b) verbas de natureza salarial ou não salarial devidas após o desligamento;
       *
       * <p>c) decisões administrativas ou judiciais relativas a diferenças de remuneração.
       *
       * <p>OBS.: As informações previstas acima podem se referir ao período de apuração definido em
       * {perApur}(1202_ideEvento_perApur) ou a períodos anteriores a
       * {perApur}(1202_ideEvento_perApur).
       *
       * <p>CONDICAO_GRUPO: O (se não existir o grupo {infoPerApur}(1202_dmDev_infoPerApur) e
       * {indApuracao}(1202_ideEvento_indApuracao) = [1]); N (se
       * {indApuracao}(1202_ideEvento_indApuracao) = [2]); OC (nos demais casos)
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
        private java.util.List<IdeEstab> ideEstab;

        /**
         * Identificação da unidade do órgão público
         *
         * @return Conteúdo do campo ideEstab
         */
        public java.util.List<IdeEstab> getIdeEstab() {
          return this.ideEstab;
        }

        /**
         * Identificação da unidade do órgão público
         *
         * <p>- Esse campo pode ser repetido até 500 vezes
         *
         * <p>DESCRICAO_COMPLETA:Identificação da unidade do órgão público na qual o servidor possui
         * remuneração.
         *
         * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
         *
         * @return O objeto IdeEstab para população dos campos filhos
         */
        public IdeEstab<InfoPerApur<T>> setIdeEstab_Next() {
          if (this.ideEstab == null) {
            this.ideEstab = new java.util.ArrayList<>();
          }
          IdeEstab toAdd = new IdeEstab(this);
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

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpInsc",
              "nrInsc",
              "remunPerApur",
            })
        public static class IdeEstab<T> {

          /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
          private String tpInsc;

          /** Informar o número de inscrição da unidade do órgão público. */
          private String nrInsc;

          /**
           * Remuneração do trabalhador
           *
           * <p>- Esse campo pode ser repetido até 8 vezes
           */
          private java.util.List<T_remunPer> remunPerApur;

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
           * @return O próprio IdeEstab para continuar populando outros campos
           */
          public IdeEstab<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
            this.tpInsc = tpInsc;
            return this;
          }
          /**
           * CNPJ
           *
           * @return O próprio IdeEstab para continuar populando outros campos
           */
          public IdeEstab<T> setTpInsc_1() {
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
           * @return O próprio IdeEstab para continuar populando outros campos
           */
          public IdeEstab<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          /**
           * Remuneração do trabalhador
           *
           * @return Conteúdo do campo remunPerApur
           */
          public java.util.List<T_remunPer> getRemunPerApur() {
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
           * @return O objeto T_remunPer para população dos campos filhos
           */
          public T_remunPer<IdeEstab<T>> setRemunPerApur_Next() {
            if (this.remunPerApur == null) {
              this.remunPerApur = new java.util.ArrayList<>();
            }
            T_remunPer toAdd = new T_remunPer(this);
            this.remunPerApur.add(toAdd);
            return toAdd;
          }

          public IdeEstab(Object pai) {
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
       * Informações relativas a períodos anteriores
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "remunOrgSuc",
            "idePeriodo",
          })
      public static class InfoPerAnt<T> {

        /**
         * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial devidas
         * pelo órgão sucessor a servidor desligado ainda no sucedido.
         */
        private String remunOrgSuc;

        /**
         * Identificação do período de referência da remuneração
         *
         * <p>- Esse campo pode ser repetido até 180 vezes
         */
        private java.util.List<IdePeriodo> idePeriodo;

        /**
         * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial devidas
         * pelo órgão sucessor a servidor desligado ainda no sucedido.
         *
         * @return Conteúdo do campo remunOrgSuc
         */
        public String getRemunOrgSuc() {
          return this.remunOrgSuc;
        }

        /**
         * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial devidas
         * pelo órgão sucessor a servidor desligado ainda no sucedido.
         *
         * @param remunOrgSuc Valor para atribuir ao campo remunOrgSuc
         * @return O próprio InfoPerAnt para continuar populando outros campos
         */
        public InfoPerAnt<T> setRemunOrgSuc(String remunOrgSuc) {
          if (!"S".equals(remunOrgSuc) && !"N".equals(remunOrgSuc))
            throw new RuntimeException(
                "Valor " + String.valueOf(remunOrgSuc) + " inválido para o campo remunOrgSuc");
          this.remunOrgSuc = remunOrgSuc;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoPerAnt para continuar populando outros campos
         */
        public InfoPerAnt<T> setRemunOrgSuc_S() {
          this.remunOrgSuc = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoPerAnt para continuar populando outros campos
         */
        public InfoPerAnt<T> setRemunOrgSuc_N() {
          this.remunOrgSuc = "N";
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
         * Identificação do período de referência da remuneração
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
           * Informar o período ao qual se refere o complemento de remuneração, no formato AAAA-MM.
           */
          private String perRef;

          /**
           * Identificação da unidade do órgão público
           *
           * <p>- Esse campo pode ser repetido até 500 vezes
           */
          private java.util.List<IdeEstab> ideEstab;

          /**
           * Informar o período ao qual se refere o complemento de remuneração, no formato AAAA-MM.
           *
           * @return Conteúdo do campo perRef
           */
          public String getPerRef() {
            return this.perRef;
          }

          /**
           * Informar o período ao qual se refere o complemento de remuneração, no formato AAAA-MM.
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
           * Identificação da unidade do órgão público
           *
           * @return Conteúdo do campo ideEstab
           */
          public java.util.List<IdeEstab> getIdeEstab() {
            return this.ideEstab;
          }

          /**
           * Identificação da unidade do órgão público
           *
           * <p>- Esse campo pode ser repetido até 500 vezes
           *
           * <p>DESCRICAO_COMPLETA:Identificação da unidade do órgão público na qual o servidor
           * possui remuneração.
           *
           * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
           *
           * @return O objeto IdeEstab para população dos campos filhos
           */
          public IdeEstab<IdePeriodo<T>> setIdeEstab_Next() {
            if (this.ideEstab == null) {
              this.ideEstab = new java.util.ArrayList<>();
            }
            IdeEstab toAdd = new IdeEstab(this);
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
                "remunPerAnt",
              })
          public static class IdeEstab<T> {

            /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
            private String tpInsc;

            /** Informar o número de inscrição da unidade do órgão público. */
            private String nrInsc;

            /**
             * Remuneração do trabalhador
             *
             * <p>- Esse campo pode ser repetido até 8 vezes
             */
            private java.util.List<T_remunPer> remunPerAnt;

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
             * @return O próprio IdeEstab para continuar populando outros campos
             */
            public IdeEstab<T> setTpInsc(String tpInsc) {
              if (!"1".equals(tpInsc))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
              this.tpInsc = tpInsc;
              return this;
            }
            /**
             * CNPJ
             *
             * @return O próprio IdeEstab para continuar populando outros campos
             */
            public IdeEstab<T> setTpInsc_1() {
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
             * @return O próprio IdeEstab para continuar populando outros campos
             */
            public IdeEstab<T> setNrInsc(String nrInsc) {
              this.nrInsc = nrInsc;
              return this;
            }

            /**
             * Remuneração do trabalhador
             *
             * @return Conteúdo do campo remunPerAnt
             */
            public java.util.List<T_remunPer> getRemunPerAnt() {
              return this.remunPerAnt;
            }

            /**
             * Remuneração do trabalhador
             *
             * <p>- Esse campo pode ser repetido até 8 vezes
             *
             * <p>DESCRICAO_COMPLETA:Informações relativas à remuneração do trabalhador em períodos
             * anteriores.
             *
             * <p>CHAVE_GRUPO: {matricula}
             *
             * @return O objeto T_remunPer para população dos campos filhos
             */
            public T_remunPer<IdeEstab<T>> setRemunPerAnt_Next() {
              if (this.remunPerAnt == null) {
                this.remunPerAnt = new java.util.ArrayList<>();
              }
              T_remunPer toAdd = new T_remunPer(this);
              this.remunPerAnt.add(toAdd);
              return toAdd;
            }

            public IdeEstab(Object pai) {
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
   * Remuneração do trabalhador
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "matricula",
        "itensRemun",
      })
  public static class T_remunPer<T> {

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     */
    private String matricula;

    /**
     * Itens da remuneração do trabalhador
     *
     * <p>- Esse campo pode ser repetido até 200 vezes
     */
    private java.util.List<Tipos.T_itensRemun_rpps> itensRemun;

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * @return Conteúdo do campo matricula
     */
    public String getMatricula() {
      return this.matricula;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2200 ou
     * S-2300 do respectivo contrato. Não preencher no caso de Trabalhador Sem Vínculo de
     * Emprego/Estatutário - TSVE sem informação de matrícula no evento S-2300 ou, no caso de
     * {remunPerAnt}(1202_dmDev_infoPerAnt_idePeriodo_ideEstab_remunPerAnt), se
     * {remunOrgSuc}(1202_dmDev_infoPerAnt_remunOrgSuc) = [S].
     *
     * @param matricula Valor para atribuir ao campo matricula
     * @return O próprio T_remunPer para continuar populando outros campos
     */
    public T_remunPer<T> setMatricula(String matricula) {
      this.matricula = matricula;
      return this;
    }

    /**
     * Itens da remuneração do trabalhador
     *
     * @return Conteúdo do campo itensRemun
     */
    public java.util.List<Tipos.T_itensRemun_rpps> getItensRemun() {
      return this.itensRemun;
    }

    /**
     * Itens da remuneração do trabalhador
     *
     * <p>- Esse campo pode ser repetido até 200 vezes
     *
     * <p>DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.
     *
     * @return O objeto Tipos.T_itensRemun_rpps para população dos campos filhos
     */
    public Tipos.T_itensRemun_rpps<T_remunPer<T>> setItensRemun_Next() {
      if (this.itensRemun == null) {
        this.itensRemun = new java.util.ArrayList<>();
      }
      Tipos.T_itensRemun_rpps toAdd = new Tipos.T_itensRemun_rpps(this);
      this.itensRemun.add(toAdd);
      return toAdd;
    }

    public T_remunPer(Object pai) {
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
