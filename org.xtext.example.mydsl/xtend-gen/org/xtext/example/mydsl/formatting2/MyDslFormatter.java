/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import empresa.Company;
import empresa.Dashboard;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final Company company, @Extension final IFormattableDocument document) {
    EList _dashboards = company.getDashboards();
    for (final Object dashboard : _dashboards) {
      document.<Object>format(dashboard);
    }
    EList _dBServers = company.getDBServers();
    for (final Object dBServer : _dBServers) {
      document.<Object>format(dBServer);
    }
  }
  
  protected void _format(final Dashboard dashboard, @Extension final IFormattableDocument document) {
    EList _panels = dashboard.getPanels();
    for (final Object panel : _panels) {
      document.<Object>format(panel);
    }
  }
  
  public void format(final Object company, final IFormattableDocument document) {
    if (company instanceof XtextResource) {
      _format((XtextResource)company, document);
      return;
    } else if (company instanceof Company) {
      _format((Company)company, document);
      return;
    } else if (company instanceof Dashboard) {
      _format((Dashboard)company, document);
      return;
    } else if (company instanceof EObject) {
      _format((EObject)company, document);
      return;
    } else if (company == null) {
      _format((Void)null, document);
      return;
    } else if (company != null) {
      _format(company, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(company, document).toString());
    }
  }
}