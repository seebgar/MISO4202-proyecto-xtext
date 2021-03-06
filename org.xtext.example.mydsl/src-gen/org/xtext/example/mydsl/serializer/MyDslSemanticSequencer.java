/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import empresa.Attribute;
import empresa.BarChart;
import empresa.Collection;
import empresa.Column;
import empresa.Company;
import empresa.DBServer;
import empresa.Dashboard;
import empresa.Data;
import empresa.Document;
import empresa.EmpresaPackage;
import empresa.Label;
import empresa.LineChart;
import empresa.Menu;
import empresa.Option;
import empresa.Panel;
import empresa.PieChart;
import empresa.RadarChart;
import empresa.Table;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EmpresaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EmpresaPackage.ACTION:
				sequence_Action(context, (empresa.Action) semanticObject); 
				return; 
			case EmpresaPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case EmpresaPackage.BAR_CHART:
				sequence_BarChart(context, (BarChart) semanticObject); 
				return; 
			case EmpresaPackage.COLLECTION:
				sequence_Collection(context, (Collection) semanticObject); 
				return; 
			case EmpresaPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case EmpresaPackage.COMPANY:
				sequence_Company(context, (Company) semanticObject); 
				return; 
			case EmpresaPackage.DB_SERVER:
				sequence_DBServer(context, (DBServer) semanticObject); 
				return; 
			case EmpresaPackage.DASHBOARD:
				sequence_Dashboard(context, (Dashboard) semanticObject); 
				return; 
			case EmpresaPackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case EmpresaPackage.DOCUMENT:
				sequence_Document(context, (Document) semanticObject); 
				return; 
			case EmpresaPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case EmpresaPackage.LINE_CHART:
				sequence_LineChart(context, (LineChart) semanticObject); 
				return; 
			case EmpresaPackage.MENU:
				sequence_Menu(context, (Menu) semanticObject); 
				return; 
			case EmpresaPackage.OPTION:
				sequence_Option(context, (Option) semanticObject); 
				return; 
			case EmpresaPackage.PANEL:
				sequence_Panel(context, (Panel) semanticObject); 
				return; 
			case EmpresaPackage.PIE_CHART:
				sequence_PieChart(context, (PieChart) semanticObject); 
				return; 
			case EmpresaPackage.RADAR_CHART:
				sequence_RadarChart(context, (RadarChart) semanticObject); 
				return; 
			case EmpresaPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         columnTitle=EString? 
	 *         position=PositionOptions? 
	 *         add?='add'? 
	 *         filter?='filter'? 
	 *         edit?='edit'? 
	 *         delete?='delete'?
	 *     )
	 */
	protected void sequence_Action(ISerializationContext context, empresa.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=EString type=EString?)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns BarChart
	 *     BarChart returns BarChart
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString 
	 *         legendPosition=PositionOptions? 
	 *         labelStringXAxes=EString? 
	 *         colorGridLinesXAxes=EString? 
	 *         labelStringYAxes=EString? 
	 *         colorGridLinesYAxes=EString? 
	 *         barPercentage=EFloat 
	 *         displayGridLinesXAxes?='displayGridLinesXAxes'? 
	 *         displayGridLinesYAxes?='displayGridLinesYAxes'? 
	 *         data+=Data 
	 *         data+=Data* 
	 *         labels+=Label 
	 *         labels+=Label*
	 *     )
	 */
	protected void sequence_BarChart(ISerializationContext context, BarChart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Collection returns Collection
	 *
	 * Constraint:
	 *     (name=EString documents+=Document documents+=Document*)
	 */
	protected void sequence_Collection(ISerializationContext context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (name=EString title=EString? source=[Collection|EString]? filter?='filter'? editable?='editable'?)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Company returns Company
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         nit=EString? 
	 *         dashboards+=Dashboard 
	 *         dashboards+=Dashboard* 
	 *         DBServers+=DBServer 
	 *         DBServers+=DBServer*
	 *     )
	 */
	protected void sequence_Company(ISerializationContext context, Company semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBServer returns DBServer
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         systemManager=DBSystem? 
	 *         token=EString? 
	 *         password=EString? 
	 *         relatedCollections+=Collection 
	 *         relatedCollections+=Collection*
	 *     )
	 */
	protected void sequence_DBServer(ISerializationContext context, DBServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dashboard returns Dashboard
	 *
	 * Constraint:
	 *     (name=EString panels+=Panel panels+=Panel*)
	 */
	protected void sequence_Dashboard(ISerializationContext context, Dashboard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Data returns Data
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         category=EString? 
	 *         borderColor=Colors? 
	 *         backgroundColor=Colors? 
	 *         borderDash=EInt? 
	 *         fill?='fill'? 
	 *         data+=[Collection|EString] 
	 *         data+=[Collection|EString]*
	 *     )
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Document returns Document
	 *
	 * Constraint:
	 *     (name=EString attributes+=Attribute attributes+=Attribute*)
	 */
	protected void sequence_Document(ISerializationContext context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Label returns Label
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EmpresaPackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EmpresaPackage.Literals.LABEL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns LineChart
	 *     LineChart returns LineChart
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString 
	 *         legendPosition=PositionOptions? 
	 *         labelStringXAxes=EString? 
	 *         colorGridLinesXAxes=EString? 
	 *         labelStringYAxes=EString? 
	 *         colorGridLinesYAxes=EString? 
	 *         displayGridLinesXAxes?='displayGridLinesXAxes'? 
	 *         displayGridLinesYAxes?='displayGridLinesYAxes'? 
	 *         data+=Data 
	 *         data+=Data* 
	 *         labels+=Label 
	 *         labels+=Label*
	 *     )
	 */
	protected void sequence_LineChart(ISerializationContext context, LineChart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Menu
	 *     Menu returns Menu
	 *
	 * Constraint:
	 *     (name=EString title=EString? options+=Option options+=Option*)
	 */
	protected void sequence_Menu(ISerializationContext context, Menu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns Option
	 *
	 * Constraint:
	 *     (name=EString icon=EString? title=EString? urlComponent=EString?)
	 */
	protected void sequence_Option(ISerializationContext context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Panel returns Panel
	 *
	 * Constraint:
	 *     (name=EString elements+=Element elements+=Element*)
	 */
	protected void sequence_Panel(ISerializationContext context, Panel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns PieChart
	 *     PieChart returns PieChart
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         legendPosition=PositionOptions? 
	 *         data+=Data 
	 *         data+=Data* 
	 *         labels+=Label 
	 *         labels+=Label*
	 *     )
	 */
	protected void sequence_PieChart(ISerializationContext context, PieChart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns RadarChart
	 *     RadarChart returns RadarChart
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString 
	 *         legendPosition=PositionOptions? 
	 *         angleLinesDisplay?='angleLinesDisplay' 
	 *         data+=Data 
	 *         data+=Data* 
	 *         labels+=Label 
	 *         labels+=Label*
	 *     )
	 */
	protected void sequence_RadarChart(ISerializationContext context, RadarChart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Table
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         registersPerPage=EInt? 
	 *         actions=Action? 
	 *         search?='search'? 
	 *         add?='add'? 
	 *         columns+=Column 
	 *         columns+=Column*
	 *     )
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
