package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/** S-1000 - Informações do Empregador/Contribuinte/Órgão Público */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(
    name = "",
    propOrder = {
      "evtInfoEmpregador",
      "signature",
    })
@XmlRootElement(name = "eSocial")
public class Evento_InfoEmpregador {

  /**
   * Evento Informações do Empregador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_INFO_EMP_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_CLASSTRIB_NATJURID
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_DTINICIAL
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   */
  private EvtInfoEmpregador evtInfoEmpregador;

  private String signature;

  /**
   * Evento Informações do Empregador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_INFO_EMP_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_CLASSTRIB_NATJURID
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_DTINICIAL
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   */
  public EvtInfoEmpregador<Evento_InfoEmpregador> evtInfoEmpregador() {
    if(evtInfoEmpregador == null) {
      evtInfoEmpregador = new EvtInfoEmpregador(this);
    }
    return evtInfoEmpregador;
  }
  
  /**
   * Evento Informações do Empregador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_INFO_EMP_PERIODO_CONFLITANTE
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_CLASSTRIB_NATJURID
   *
   * <p>REGRA:REGRA_INFO_EMP_VALIDA_DTINICIAL
   *
   * <p>REGRA:REGRA_TAB_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_VALIDA_DT_FUTURA
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   */
  @XmlAccessorType(XmlAccessType.PROPERTY)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoEmpregador",
      })
  public static class EvtInfoEmpregador<T> {

    private final Object pai;

    public EvtInfoEmpregador(Object pai) {
      this.pai = pai;
    }

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_evtTab ideEvento;

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     */
    private IdeEmpregador ideEmpregador;

    /**
     * Informações do empregador.
     *
     * <p>DESCRICAO_COMPLETA:Identificação da operação (inclusão, alteração ou exclusão) e das
     * respectivas informações do empregador.
     */
    private InfoEmpregador infoEmpregador;
    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     */
    public IdeEmpregador<EvtInfoEmpregador<Evento_InfoEmpregador>> ideEmpregador() {
      if(ideEmpregador == null) {
        ideEmpregador = new IdeEmpregador(this);
      }
      return ideEmpregador;
    }
    
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
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(
        name = "",
        propOrder = {
          "tpInsc", "nrInsc",
        })
    public static class IdeEmpregador<T> {

      private final Object pai;

      public IdeEmpregador(Object pai) {
        this.pai = pai;
      }

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {tpInsc}(./tpInsc).
       *
       * <p>Validação: Se {tpInsc}(./tpInsc) for igual a [1], deve ser um número de CNPJ válido.
       * Neste caso, deve ser informada apenas a raiz/base (8 posições), exceto se natureza jurídica
       * do declarante for igual a 101-5, 104-0, 107-4, 110-4, 113-9, 116-3, 119-8, 125-2, 128-7,
       * 131-7 ou 134-1, situação em que o campo deve ser preenchido com o CNPJ completo (14
       * posições).
       *
       * <p>Se {tpInsc}(./tpInsc) for igual a [2], deve ser um CPF válido.
       */
      private String nrInsc;

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
     * Informações do empregador.
     *
     * <p>Obs.: Escolha somente um dos campos filhos
     *
     * <p>DESCRICAO_COMPLETA:Identificação da operação (inclusão, alteração ou exclusão) e das
     * respectivas informações do empregador.
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(
        name = "",
        propOrder = {
          "inclusao",
          "alteracao",
          "exclusao",
        })
    public static class InfoEmpregador<T> {

      private final Object pai;

      public InfoEmpregador(Object pai) {
        this.pai = pai;
      }

      /**
       * Inclusão de novas informações.
       *
       * <p>CONDICAO_GRUPO: OC
       */
      private Inclusao inclusao;

      /**
       * Alteração das informações.
       *
       * <p>CONDICAO_GRUPO: OC
       */
      private Alteracao alteracao;

      /**
       * Exclusão das informações.
       *
       * <p>CONDICAO_GRUPO: OC
       */
      private Exclusao exclusao;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }

      /**
       * Inclusão de novas informações.
       *
       * <p>CONDICAO_GRUPO: OC
       */
      @XmlAccessorType(XmlAccessType.PROPERTY)
      @XmlType(
          name = "",
          propOrder = {
            "idePeriodo",
            "infoCadastro",
          })
      public static class Inclusao<T> {

        private final Object pai;

        public Inclusao(Object pai) {
          this.pai = pai;
        }

        /**
         * Período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
         */
        private T_idePeriodo idePeriodo;

        /** Detalhamento das informações do empregador. */
        private T_infoCadastro infoCadastro;

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
       * Alteração das informações.
       *
       * <p>CONDICAO_GRUPO: OC
       */
      @XmlAccessorType(XmlAccessType.PROPERTY)
      @XmlType(
          name = "",
          propOrder = {
            "idePeriodo",
            "infoCadastro",
            "novaValidade",
          })
      public static class Alteracao<T> {

        private final Object pai;

        public Alteracao(Object pai) {
          this.pai = pai;
        }

        /**
         * Período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
         */
        private T_idePeriodo idePeriodo;

        /** Detalhamento das informações do empregador. */
        private T_infoCadastro infoCadastro;

        /**
         * Novo período de validade das informações.
         *
         * <p>DESCRICAO_COMPLETA:Informação preenchida exclusivamente em caso de alteração do
         * período de validade das informações, apresentando o novo período de validade.
         *
         * <p>CONDICAO_GRUPO: OC
         */
        private T_idePeriodo novaValidade;

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
       * Exclusão das informações.
       *
       * <p>CONDICAO_GRUPO: OC
       */
      @XmlAccessorType(XmlAccessType.PROPERTY)
      @XmlType(
          name = "",
          propOrder = {
            "idePeriodo",
          })
      public static class Exclusao<T> {

        private final Object pai;

        public Exclusao(Object pai) {
          this.pai = pai;
        }

        /**
         * Período de validade das informações.
         *
         * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
         */
        private T_idePeriodo idePeriodo;

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
   * Período de validade das informações.
   *
   * <p>CHAVE_GRUPO: {iniValid}, {fimValid}
   */
  @XmlAccessorType(XmlAccessType.PROPERTY)
  @XmlType(
      name = "",
      propOrder = {
        "iniValid",
        "fimValid",
      })
  public static class T_idePeriodo<T> {

    private final Object pai;

    public T_idePeriodo(Object pai) {
      this.pai = pai;
    }

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     *
     * <p>Validação: Deve ser uma data válida, igual ou posterior à data de início de
     * obrigatoriedade deste evento para o empregador no eSocial, no formato AAAA-MM.
     */
    private String iniValid;

    /**
     * Preencher com o mês e ano de término da validade das informações, se houver.
     *
     * <p>Validação: Se informado, deve estar no formato AAAA-MM e ser um período igual ou posterior
     * a {iniValid}(./iniValid).
     */
    private String fimValid;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
  }

  /** Detalhamento das informações do empregador. */
  @XmlAccessorType(XmlAccessType.PROPERTY)
  @XmlType(
      name = "",
      propOrder = {
        "classTrib",
        "indCoop",
        "indConstr",
        "indDesFolha",
        "indOpcCP",
        "indPorte",
        "indOptRegEletron",
        "cnpjEFR",
        "dadosIsencao",
        "infoOrgInternacional",
      })
  public static class T_infoCadastro<T> {

    private final Object pai;

    public T_infoCadastro(Object pai) {
      this.pai = pai;
    }

    /**
     * Preencher com o código correspondente à classificação tributária do contribuinte.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 08. Os códigos [21] e [22]
     * somente podem ser utilizados se {tpInsc}(1000_ideEmpregador_tpInsc) for igual a [2]. Para os
     * demais códigos, {tpInsc}(1000_ideEmpregador_tpInsc) deve ser igual a [1].
     */
    private String classTrib;

    /**
     * Indicativo de cooperativa.
     *
     * <p>Validação: O preenchimento do campo é exclusivo e obrigatório para PJ. Somente pode ser
     * diferente de [0] se a natureza jurídica do declarante for igual a 214-3.
     */
    private String indCoop;

    /**
     * Indicativo de construtora.
     *
     * <p>Validação: O preenchimento do campo é exclusivo e obrigatório para PJ.
     */
    private String indConstr;

    /**
     * Indicativo de desoneração da folha.
     *
     * <p>Validação: Pode ser igual a [1] apenas se {classTrib}(./classTrib) = [02, 03, 99]. Nos
     * demais casos, deve ser igual a [0].
     */
    private String indDesFolha;

    /**
     * Indicativo da opção pelo produtor rural pela forma de tributação da contribuição
     * previdenciária, nos termos do art. 25, § 13, da Lei 8.212/1991 e do art. 25, § 7°, da Lei
     * 8.870/1994. O não preenchimento deste campo por parte do produtor rural implica opção pela
     * comercialização da sua produção.
     *
     * <p>Validação: Não preencher se {classTrib}(./classTrib) for diferente de [07, 21].
     */
    private String indOpcCP;

    /**
     * Indicativo de microempresa - ME ou empresa de pequeno porte - EPP para permissão de acesso ao
     * módulo simplificado. Não preencher caso o empregador não se enquadre como micro ou pequena
     * empresa.
     *
     * <p>Validação: Não preencher se {classTrib}(./classTrib) = [21, 22].
     */
    private String indPorte;

    /** Indica se houve opção pelo registro eletrônico de empregados. */
    private String indOptRegEletron;

    /**
     * CNPJ do Ente Federativo Responsável - EFR.
     *
     * <p>Validação: Preenchimento obrigatório e exclusivo se a natureza jurídica do declarante for
     * Administração Pública (grupo [1]). Nesse caso, informar o campo com 14 (catorze) algarismos.
     *
     * <p>Informação validada no cadastro do CNPJ da RFB.
     */
    private String cnpjEFR;

    /**
     * Informações complementares - Empresas isentas - Dados da isenção.
     *
     * <p>CONDICAO_GRUPO: OC (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) =
     * [80]); N (nos demais casos)
     */
    private DadosIsencao dadosIsencao;

    /**
     * Informações exclusivas de organismos internacionais e outras instituições extraterritoriais.
     *
     * <p>CONDICAO_GRUPO: O (se a natureza jurídica pertencer ao grupo [5]); N (nos demais casos)
     */
    private InfoOrgInternacional infoOrgInternacional;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }

    /**
     * Informações complementares - Empresas isentas - Dados da isenção.
     *
     * <p>CONDICAO_GRUPO: OC (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) =
     * [80]); N (nos demais casos)
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(
        name = "",
        propOrder = {
          "ideMinLei",
          "nrCertif",
          "dtEmisCertif",
          "dtVencCertif",
          "nrProtRenov",
          "dtProtRenov",
          "dtDou",
          "pagDou",
        })
    public static class DadosIsencao<T> {

      private final Object pai;

      public DadosIsencao(Object pai) {
        this.pai = pai;
      }

      /** Sigla e nome do Ministério ou lei que concedeu o certificado. */
      private String ideMinLei;

      /**
       * Número do Certificado de Entidade Beneficente de Assistência Social - CEBAS, número da
       * portaria de concessão do certificado, ou, no caso de concessão através de lei específica, o
       * número da lei.
       */
      private String nrCertif;

      /** Data de emissão do certificado/publicação da lei. */
      private javax.xml.datatype.XMLGregorianCalendar dtEmisCertif;

      /**
       * Data de vencimento do certificado.
       *
       * <p>Validação: Não pode ser anterior a {dtEmisCertif}(./dtEmisCertif).
       */
      private javax.xml.datatype.XMLGregorianCalendar dtVencCertif;

      /** Número do protocolo do pedido de renovação. */
      private String nrProtRenov;

      /** Data do protocolo de renovação. */
      private javax.xml.datatype.XMLGregorianCalendar dtProtRenov;

      /** Data de publicação no Diário Oficial da União - DOU. */
      private javax.xml.datatype.XMLGregorianCalendar dtDou;

      /**
       * Número da página no DOU referente à publicação do documento de concessão do certificado.
       */
      private Integer pagDou;

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
     * Informações exclusivas de organismos internacionais e outras instituições extraterritoriais.
     *
     * <p>CONDICAO_GRUPO: O (se a natureza jurídica pertencer ao grupo [5]); N (nos demais casos)
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(
        name = "",
        propOrder = {
          "indAcordoIsenMulta",
        })
    public static class InfoOrgInternacional<T> {

      private final Object pai;

      public InfoOrgInternacional(Object pai) {
        this.pai = pai;
      }

      /** Indicativo da existência de acordo internacional para isenção de multa. */
      private String indAcordoIsenMulta;

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
